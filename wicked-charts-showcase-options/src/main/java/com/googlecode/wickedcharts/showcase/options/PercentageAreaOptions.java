package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Marker;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Stacking;
import com.googlecode.wickedcharts.highcharts.options.TickmarkPlacement;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

public class PercentageAreaOptions extends Options {

  private static final long serialVersionUID = 1L;

  public PercentageAreaOptions() {
    setChartOptions(new ChartOptions()
        .setType(SeriesType.AREA));

    setTitle(new Title(
        "Historic and Estimated Worldwide Population Growth by Region"));

    setSubtitle(new Title("Source: Wikipedia.org"));

    setxAxis(new Axis()
        .setCategories(
            Arrays
                .asList(new String[] { "1750", "1800", "1850", "1900", "1950",
                    "1999", "2050" }))
        .setTickmarkPlacement(TickmarkPlacement.ON)
        .setTitle(new Title().setEnabled(Boolean.FALSE)));

    setyAxis(new Axis()
        .setTitle(new Title("Percent")));

    setTooltip(new Tooltip()
        .setFormatter(new Function()
            .setFunction("return ''+this.x +': '+ Highcharts.numberFormat(this.percentage, 1) +'% ('+Highcharts.numberFormat(this.y, 0, ',') +' millions)';")));

    setPlotOptions(new PlotOptionsChoice()
        .setArea(new PlotOptions()
            .setStacking(Stacking.PERCENT)
            .setLineColor(new HexColor("#ffffff"))
            .setLineWidth(1)
            .setMarker(new Marker()
                .setLineWidth(1)
                .setLineColor(new HexColor("#ffffff")))));

    addSeries(new SimpleSeries()
        .setName("Asia")
        .setData(
            Arrays
                .asList(new Number[] { 502, 635, 809, 947, 1402, 3634, 5268 })));

    addSeries(new SimpleSeries()
        .setName("Africa")
        .setData(
            Arrays
                .asList(new Number[] { 106, 107, 111, 133, 221, 767, 1766 })));

    addSeries(new SimpleSeries()
        .setName("Europe")
        .setData(
            Arrays
                .asList(new Number[] { 163, 203, 276, 408, 547, 729, 628 })));

    addSeries(new SimpleSeries()
        .setName("America")
        .setData(
            Arrays
                .asList(new Number[] { 18, 31, 54, 156, 339, 818, 1201 })));

    addSeries(new SimpleSeries()
        .setName("Oceania")
        .setData(Arrays.asList(new Number[] { 2, 2, 2, 6, 13, 30, 46 })));
  }
}
