package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.ExportingOptions;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.PlotLine;
import com.googlecode.wickedcharts.highcharts.options.PlotOptions;
import com.googlecode.wickedcharts.highcharts.options.PlotOptionsChoice;
import com.googlecode.wickedcharts.highcharts.options.PointOptions;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;
import com.googlecode.wickedcharts.highcharts.options.functions.AddPointFunction;
import com.googlecode.wickedcharts.highcharts.options.functions.RemovePointFunction;
import com.googlecode.wickedcharts.highcharts.options.series.CoordinatesSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class ClickToAddAPointOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;
  
  public ClickToAddAPointOptions() {

    this.setChartOptions(new ChartOptions()
        .setType(SeriesType.SCATTER)
        .setMargin(Arrays.asList(70, 50, 60, 80))
        .setEvents(new Events().setClick(new AddPointFunction())));

    this.setTitle(new Title("User supplied data"));

    this.setSubtitle(new Title(
        "Click the plot area to add a point. Click a point to remove it."));

    this.setxAxis(new Axis()
        .setMinPadding(0.2f)
        .setMaxPadding(0.2f)
        .setMaxZoom(60));

    this.setyAxis(new Axis()
        .setTitle(new Title("Value"))
        .setMinPadding(0.2f)
        .setMaxPadding(0.2f)
        .setMaxZoom(60)
        .addPlotLine(new PlotLine()
            .setValue(0f)
            .setWidth(1)
            .setColor(HexColor.fromString("#808080"))));

    this.setLegend(new Legend()
        .setEnabled(Boolean.FALSE));

    this.setExporting(new ExportingOptions()
        .setEnabled(Boolean.FALSE));

    this.setPlotOptions(new PlotOptionsChoice()
        .setSeries(new PlotOptions()
            .setLineWidth(1)
            .setPoint(new PointOptions()
                .setEvents(new Events()
                    .setClick(new RemovePointFunction())))));

    this.addSeries(new CoordinatesSeries()
        .addPoint(20, 20)
        .addPoint(80, 80));

  }

  @Override
  public String getLabel() {
    return "Click to add a point";
  }

}
