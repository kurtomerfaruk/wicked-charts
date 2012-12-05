/**
 *   Copyright 2012 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedcharts.showcase.options;

import java.util.Arrays;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.AxisType;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.MinorTickInterval;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.Series;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

/**
 * Demo of the same line chart with logarithmic axis displayed in the Highcharts
 * Demo at <a href=
 * "http://highcharts.com/demo/line-log-axis">http://highcharts.
 * com/demo/line-log-axis</a>.
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
public class LogarithmicAxisOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public LogarithmicAxisOptions() {
    ChartOptions chartOptions = new ChartOptions();
    this
        .setChartOptions(chartOptions);

    Title title = new Title("Logarithmic Axis Demo");
    this
        .setTitle(title);

    Axis xAxis = new Axis();
    xAxis
        .setTickInterval(1f);
    this
        .setxAxis(xAxis);

    Axis yAxis = new Axis();
    yAxis
        .setTitle(new Title("Y-Values"));
    yAxis
        .setType(AxisType.LOGARITHMIC);

    MinorTickInterval minorTickInterval = new MinorTickInterval();
    yAxis
        .setMinorTickInterval(minorTickInterval
            .setInterval(0.1));
    this
        .setyAxis(yAxis);

    Tooltip tooltip = new Tooltip();
    tooltip
        .setHeaderFormat("<b>{series.name}</b><br>");
    tooltip
        .setPointFormat("x = {point.x}, y = {point.y}");

    this
        .setTooltip(tooltip);

    Series<Number> series1 = new SimpleSeries();
    series1
        .setData(Arrays
            .asList(new Number[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 }));
    series1
        .setPointStart(1);
    addSeries(series1);

  }

  @Override
  public String getLabel() {
    return "Line with logarithmic axis";
  }

}
