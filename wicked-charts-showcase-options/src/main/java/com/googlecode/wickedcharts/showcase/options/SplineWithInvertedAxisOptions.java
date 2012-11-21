package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CssStyle;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.CoordinatesSeries;

/**
 * Demo of the same chart displayed in the Highcharts Demo at <a href=
 * "http://www.highcharts.com/demo/spline-inverted"
 * >http://www.highcharts.com/demo/spline-inverted</a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SplineWithInvertedAxisOptions extends Options {

  private static final long serialVersionUID = 1L;

  public SplineWithInvertedAxisOptions() {

    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.SPLINE);
    chartOptions
        .setInverted(Boolean.TRUE);
    chartOptions
        .setStyle(new CssStyle());
    this.setChartOptions(chartOptions);

    this.setTitle(new Title("Atmosphere Temperature by Altitude"));
    this.setSubtitle(new Title("According to the Standard Atmosphere Model"));

    Title AxisTitle = new Title("Altitude");
    AxisTitle
        .setEnabled(Boolean.TRUE);

    Axis xAxis = new Axis();
    xAxis
        .setReversed(Boolean.FALSE);
    xAxis
        .setTitle(AxisTitle);
    xAxis
        .setLabels(new Labels()
            .setStyle(new CssStyle()));
    xAxis
        .setMaxPadding(0.05f);
    xAxis
        .setShowLastLabel(Boolean.TRUE);
    this.setyAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Temperature"));
    yAxis
        .setLabels(new Labels()
            .setStyle(new CssStyle()));
    yAxis
        .setLineWidth(2);
    this.setyAxis(yAxis);

    this.setLegend(new Legend(Boolean.TRUE));

    this.setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return '' + this.x +' km: '+ this.y +'C';")));

    PlotOptions splineOptions = new PlotOptions();
    splineOptions
        .setMarker(new Marker(Boolean.TRUE));

    this.setPlotOptions(new PlotOptionsChoice()
        .setSpline(splineOptions));
    CoordinatesSeries series = new CoordinatesSeries();
    series
        .addPoint(0, 15)
        .addPoint(10, -50)
        .addPoint(20, -56.5)
        .addPoint(30, -46.5)
        .addPoint(40, -22.1)
        .addPoint(50, -2.5)
        .addPoint(60, -27.7)
        .addPoint(70, -55.7)
        .addPoint(80, -76.5);
    this.addSeries(series);

  }
}
