# Basic Chart Types #

**Supported by:** _wicked-charts-wicket14, wicked-charts-wicket15, wicked-charts-wicket6, wicked-charts-jsf21_

---


Highcharts and thus Wicked Charts support a set of different chart types that are listed in the [SeriesType](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/SeriesType.html) enumeration. Basic chart types only need the file highcharts.js to work properly while advanced charts additionally need the file highcharts\_more.js to work.

For an example of how to create a basic charts with Wicket and JSF please consult the [Started](Getting.md) page.

The basic chart types are:
  * area charts
  * area spline charts
  * column charts
  * bar charts
  * line charts
  * pie charts
  * scatter charts
  * spline charts
  * any combination of the above (see example "Column, line and pie" in the [Showcase](http://wicked-charts.appspot.com)

All chart types and the java code needed to create them can be viewed online in the [Showcase](http://wicked-charts.appspot.com).

## Defining the chart type globally ##
If you want all series within your chart to have the same chart type, you can define the type in the [ChartOptions](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/ChartOptions.html) of a chart:

```
options.setChartOptions(new ChartOptions()
  .setType(SeriesType.AREA));
```

## Defining the chart type for each series ##
If you have more than one series in a chart that are supposed to be of a different type, you can set the type for each [Series](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/series/Series.html) separately:

```
options.addSeries(new SimpleSeries()
  .setType(SeriesType.AREA)
  .setData(1,2,3));

options.addSeries(new SimpleSeries()
  .setType(SeriesType.LINE)
  .setData(1,2,3));
```


## Using Wicket ##
You have nothing to care about, since the Wicket components take care of loading the correct javascript files needed for the chart types.

## Using JSF ##
You have to include the following javascript files manually into your page:
  * current version of jQuery
  * http://code.highcharts.com/highcharts.js
  * http://code.highcharts.com/modules/exporting.js (if you have added enabled [ExportingOptions](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/ExportingOptions.html) to your chart)