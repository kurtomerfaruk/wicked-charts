package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Cursor;
import com.googlecode.wickedcharts.highcharts.options.DataLabels;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.color.HighchartsColor;
import com.googlecode.wickedcharts.highcharts.options.color.NullColor;
import com.googlecode.wickedcharts.highcharts.options.color.RadialGradient;
import com.googlecode.wickedcharts.highcharts.options.functions.PercentageFormatter;
import com.googlecode.wickedcharts.highcharts.options.series.Point;
import com.googlecode.wickedcharts.highcharts.options.series.PointSeries;

public class PieWithGradientOptions extends Options {

  private static final long serialVersionUID = 1L;

  public PieWithGradientOptions() {

    setChartOptions(new ChartOptions()
        .setPlotBackgroundColor(new NullColor())
        .setPlotBorderWidth(null)
        .setPlotShadow(Boolean.FALSE));

    setTitle(new Title("Browser market shares at a specific website, 2010"));

    setTooltip(new Tooltip()
        .setFormatter(new PercentageFormatter())
        .setPercentageDecimals(1));

    setPlotOptions(new PlotOptionsChoice()
        .setPie(new PlotOptions()
            .setAllowPointSelect(Boolean.TRUE)
            .setCursor(Cursor.POINTER)
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE)
                .setColor(new HexColor("#000000"))
                .setConnectorColor(new HexColor("#000000"))
                .setFormatter(new PercentageFormatter()))));

    addSeries(new PointSeries()
        .setType(SeriesType.PIE)
        .setName("Browser share")
        .addPoint(new Point("Firefox", 45.0).setColor(new RadialGradient()
            .setCx(0.5)
            .setCy(0.3)
            .setR(0.7)
            .addStop(0, new HighchartsColor(0))
            .addStop(1, new HighchartsColor(0)
                .brighten(-0.3f))))
        .addPoint(new Point("IE", 26.8).setColor(new RadialGradient()
            .setCx(0.5)
            .setCy(0.3)
            .setR(0.7)
            .addStop(0, new HighchartsColor(1))
            .addStop(1, new HighchartsColor(1)
                .brighten(-0.3f))))
        .addPoint(new Point("Chrome", 12.8)
            .setSliced(Boolean.TRUE)
            .setSelected(Boolean.TRUE)
            .setColor(new RadialGradient()
                .setCx(0.5)
                .setCy(0.3)
                .setR(0.7)
                .addStop(0, new HighchartsColor(2))
                .addStop(1, new HighchartsColor(2).brighten(-0.3f))))
        .addPoint(new Point("Safari", 8.5).setColor(new RadialGradient()
            .setCx(0.5)
            .setCy(0.3)
            .setR(0.7)
            .addStop(0, new HighchartsColor(3))
            .addStop(1, new HighchartsColor(3)
                .brighten(-0.3f))))
        .addPoint(new Point("Opera", 6.2).setColor(new RadialGradient()
            .setCx(0.5)
            .setCy(0.3)
            .setR(0.7)
            .addStop(0, new HighchartsColor(4))
            .addStop(1, new HighchartsColor(4)
                .brighten(-0.3f))))
        .addPoint(new Point("Others", 0.7).setColor(new RadialGradient()
            .setCx(0.5)
            .setCy(0.3)
            .setR(0.7)
            .addStop(0, new HighchartsColor(5))
            .addStop(1, new HighchartsColor(5)
                .brighten(-0.3f)))));

  }

}
