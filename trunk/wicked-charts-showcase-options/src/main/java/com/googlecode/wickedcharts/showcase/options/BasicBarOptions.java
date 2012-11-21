package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CreditOptions;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.Labels;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.LegendLayout;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.Overflow;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

public class BasicBarOptions extends Options {

  private static final long serialVersionUID = 1L;

  public BasicBarOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.BAR));

    setTitle(new Title("Historic World Population by Region"));

    setSubtitle(new Title("Source: Wikipedia.org"));

    setxAxis(new Axis()
        .setCategories("Africa", "America", "Asia", "Europe", "Oceania")
        .setTitle(new Title(null)));

    setyAxis(new Axis()
        .setTitle(
            new Title("Population (millions)")
                .setAlign(HorizontalAlignment.HIGH))
        .setLabels(new Labels().setOverflow(Overflow.JUSTIFY)));

    setTooltip(new Tooltip()
        .setFormatter(new Function(
            "return ''+this.series.name +': '+ this.y +' millions';")));

    setPlotOptions(new PlotOptionsChoice()
        .setBar(new PlotOptions()
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE))));

    setLegend(new Legend()
        .setLayout(LegendLayout.VERTICAL)
        .setAlign(HorizontalAlignment.RIGHT)
        .setVerticalAlign(VerticalAlignment.TOP)
        .setX(-100)
        .setY(100)
        .setFloating(Boolean.TRUE)
        .setBorderWidth(1)
        .setBackgroundColor(new HexColor("#ffffff"))
        .setShadow(Boolean.TRUE));

    setCredits(new CreditOptions()
        .setEnabled(Boolean.FALSE));

    addSeries(new SimpleSeries()
        .setName("Year 1800")
        .setData(107, 31, 635, 203, 2));

    addSeries(new SimpleSeries()
        .setName("Year 1900")
        .setData(133, 156, 947, 408, 6));

    addSeries(new SimpleSeries()
        .setName("Year 2008")
        .setData(973, 914, 4054, 732, 34));

  }
}
