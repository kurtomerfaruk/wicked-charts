package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.Series;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

/**
 * Demo of the same chart with data labels displayed in the Highcharts Demo at
 * <a href=
 * "http://www.highcharts.com/demo/line-labels">http://www.highcharts.com/demo
 * /line-labels</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class LineWithDataLabelsOptions extends Options {

  private static final long serialVersionUID = 1L;

  public LineWithDataLabelsOptions() {

    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.LINE);
    chartOptions
        .setMarginRight(130);
    chartOptions
        .setMarginBottom(25);
    setChartOptions(chartOptions);

    Title title = new Title("Monthly Average Temperature");
    title
        .setX(-20);
    setTitle(title);

    Title subTitle = new Title("Source: WorldClimate.com");
    subTitle
        .setX(-20);
    setSubtitle(subTitle);

    Axis xAxis = new Axis();
    xAxis
        .setCategories(Arrays
            .asList(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
    setxAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Temperature (°C)"));
    setyAxis(yAxis);

    setTooltip(new Tooltip());

    DataLabels dataLabels = new DataLabels(Boolean.TRUE);

    PlotOptions lineOptions = new PlotOptions();
    lineOptions
        .setDataLabels(dataLabels);
    lineOptions
        .setEnableMouseTracking(Boolean.TRUE);
    setPlotOptions(new PlotOptionsChoice()
        .setLine(lineOptions));

    Series<Number> series1 = new SimpleSeries();
    series1
        .setName("Tokyo");
    series1
        .setData(Arrays
            .asList(new Number[] { 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5,
                23.3, 18.3, 13.9, 9.6 }));
    addSeries(series1);

    Series<Number> series2 = new SimpleSeries();
    series2
        .setName("London");
    series2
        .setData(Arrays
            .asList(new Number[] { 3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6,
                14.2, 10.3, 6.6, 4.8 }));
    addSeries(series2);

  }

}
