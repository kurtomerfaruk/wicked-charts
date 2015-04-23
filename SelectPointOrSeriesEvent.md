# Selecting Points or Series #

**Supported by:** _wicked-charts-wicket6_

---


In some use cases it may be required for the server to react on a user selecting a point or series. This can be achieved by adding an [InteractionFunction](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/interaction/InteractionFunction.html) to your chart options. The InteractionFunction triggers and AJAX request to the server. The server can read the provided [InteractionEvent](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/interaction/InteractionEvent.html) object to determine which point or series has been interacted with and react accordingly.

## Interacting with a series ##

The following code adds a click interaction to all series of a line chart. If the user clicks on a series, the server simply prints out the name of the clicked series.

```
options.setPlotOptions(new PlotOptionsChoice()
  .setLine(new PlotOptions()
    .setEvents(new Events()
      .setClick(new InteractionFunction(options) {
        @Override
        public void onInteraction(InteractionEvent event) {
          System.out
            .println(event.getSelectedSeries().getName());
        }}))));
```


## Interacting with a point ##

The following code adds a click interaction to a point in a chart. If the user clicks on the point, the server simply prints out the y value of the clicked point and the name of the series the point is part of.

Note that you can only add [Events](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/Events.html) to a [Point](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/series/Point.html) object, i.e. you have to use a [PointSeries](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/series/PointSeries.html) to be able to use this feature.

```
Series<Point> series = new PointSeries().setName("My Series");
series.addPoint(new Point(107).setEvents(new Events()
        .setClick(new InteractionFunction(options) {

          @Override
          public void onInteraction(InteractionEvent event) {
            System.out
                .println("Y-Value: " + event
                    .getSelectedPoint()
                    .getY());
            System.out
                .println("Series: " + event
                    .getSelectedSeries()
                    .getName());
          }

        });))
options.add(series);
```

## AJAX with Wicket 6.x ##
Using Wicket 6, you can also access the Wicket AjaxRequestTarget on the server side to implement partial page updates. You simply have to cast the InteractionEvent to [WicketInteractionEvent](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/wicket6/highcharts/features/interaction/WicketInteractionEvent.html) as follows:

```
events.setClick(new InteractionFunction(options){
  @Override
  public void onInteraction(InteractionEvent event) {
    WicketInteractionEvent wicketEvent = (WicketInteractionEvent) event;
    AjaxRequestTarget target = wicketEvent.getAjaxRequestTarget();
           
    // re-render some component
    target.add(...);
  }
}
```