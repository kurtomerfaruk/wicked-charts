package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;
import java.util.List;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Stacking;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

public class BarWithNegativeStackOptions extends Options {

  private static final long serialVersionUID = 1L;

  public BarWithNegativeStackOptions() {

    setChart(new ChartOptions()
        .setType(SeriesType.BAR));

    setTitle(new Title("Population pyramid for Germany, midyear 2010"));

    setSubtitle(new Title("Source: www.census.gov"));

    List<String> categories = Arrays
        .asList(
            "0-4",
            "5-9",
            "10-14",
            "15-19",
            "20-24",
            "25-29",
            "30-34",
            "35-39",
            "40-44",
            "45-49",
            "50-54",
            "55-59",
            "60-64",
            "65-69",
            "70-74",
            "75-79",
            "80-84",
            "85-89",
            "90-94",
            "95-99",
            "100 +");

    addxAxis(new Axis()
        .setCategories(categories)
        .setReversed(Boolean.FALSE));

    addxAxis(new Axis()
        .setCategories(categories)
        .setReversed(Boolean.FALSE)
        .setOpposite(Boolean.TRUE)
        .setLinkedTo(0));

    setyAxis(new Axis()
        .setTitle(new Title(null))
        .setLabels(new Labels().setFormatter(new Function()
            .setFunction("return (Math.abs(this.value) / 1000000) + 'M';")))
        .setMin(-4000000)
        .setMax(4000000));

    setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setStacking(Stacking.NORMAL)));

    addSeries(new SimpleSeries()
        .setName("Male")
        .setData(
            -1746181,
            -1884428,
            -2089758,
            -2222362,
            -2537431,
            -2507081,
            -2443179,
            -2664537,
            -3556505,
            -3680231,
            -3143062,
            -2721122,
            -2229181,
            -2227768,
            -2176300,
            -1329968,
            -836804,
            -354784,
            -90569,
            -28367,
            -3878));

    addSeries(new SimpleSeries()
        .setName("Female")
        .setData(
            1656154,
            1787564,
            1981671,
            2108575,
            2403438,
            2366003,
            2301402,
            2519874,
            3360596,
            3493473,
            3050775,
            2759560,
            2304444,
            2426504,
            2568938,
            1785638,
            1447162,
            1005011,
            330870,
            130632,
            21208));
  }
}
