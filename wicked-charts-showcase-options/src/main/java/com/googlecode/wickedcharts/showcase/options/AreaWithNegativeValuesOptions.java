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
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.CreditOptions;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.series.Series;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;

/**
 * Demo of the same area chart with negative values displayed in the Highcharts
 * Demo at <a href=
 * "http://highcharts.com/demo/area-negative">http://highcharts.
 * com/demo/area-negative</a>.
 * 
 * @author Matthias Balke <matthias.balke@gmail.com>
 * 
 */
public class AreaWithNegativeValuesOptions extends Options {

  private static final long serialVersionUID = 1L;

  public AreaWithNegativeValuesOptions() {

    ChartOptions chartOptions = new ChartOptions();
    chartOptions
        .setType(SeriesType.AREA);
    this
        .setChartOptions(chartOptions);

    this
        .setTitle(new Title("Area chart with negative values"));

    Axis xAxis = new Axis();
    xAxis
        .setCategories(Arrays
            .asList(new String[] { "Apples", "Oranges", "Pears", "Grapes",
                "Bananas" }));
    this
        .setxAxis(xAxis);

    Tooltip tooltip = new Tooltip();
    tooltip
        .setFormatter(new Function(
            "return ''+this.series.name +': '+ this.y +'';"));
    this
        .setTooltip(tooltip);

    CreditOptions credits = new CreditOptions();
    credits
        .setEnabled(true);
    this
        .setCredits(credits);

    Series<Number> series1 = new SimpleSeries();
    series1
        .setName("John");
    series1
        .setData(Arrays
            .asList(new Number[] { 5, 3, 4, 7, 2 }));
    addSeries(series1);

    Series<Number> series2 = new SimpleSeries();
    series2
        .setName("Jane");
    series2
        .setData(Arrays
            .asList(new Number[] { 2, -2, -3, 2, 1 }));
    addSeries(series2);

    Series<Number> series3 = new SimpleSeries();
    series3
        .setName("Joe");
    series3
        .setData(Arrays
            .asList(new Number[] { 3, 4, 4, -2, 5 }));
    addSeries(series3);

  }

}
