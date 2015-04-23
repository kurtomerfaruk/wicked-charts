# Zoom / Select a portion of a chart #

**Supported by:** _wicked-charts-wicket6_

---


Highcharts and Wicked Charts support zooming (see ChartOptions.setZoomType()). The user may select a portion of the x or y axis of a chart.

Highcharts provides the selection event to hook into and respond to the selection the user made (see http://api.highcharts.com/highcharts#chart.events.selection). WickedCharts provides the [SelectionFunction](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/interaction/SelectionFunction.html) to respond to this event on the server side.

## Using SelectionFunction ##
The [SelectionFunction](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/interaction/SelectionFunction.html) must be added to the selection Event of the [ChartOptions](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/ChartOptions.html) as follows:

```

chartOptions
        .setEvents(new Events()
            .setSelection(new SelectionFunction(this) {

              @Override
              public void onSelect(final SelectionEvent event) {
                 // do whatever you want with the 
                 // data provided in the event
              }
            }));

```

## AJAX with Wicket 6.x ##
Using Wicket 6, you can also access the Wicket AjaxRequestTarget on the server side to implement partial page updates. You simply have to cast the SelectionEvent to [WicketSelectionEvent](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/wicket6/highcharts/features/selection/WicketSelectionEvent.html) as follows:

```
events.setSelection(new SelectionFunction(options){
  @Override
  public void onSelect(SelectionEvent event) {
    WicketSelectionEvent wicketEvent = (WicketSelectionEvent) event;
    AjaxRequestTarget target = wicketEvent.getAjaxRequestTarget();
           
    // re-render some component
    target.add(...);
  }
}
```