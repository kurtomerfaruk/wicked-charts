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
package com.googlecode.wickedcharts.highcharts.options.util;

import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Events;
import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.Options;

public class OptionsUtil {

  private static OptionsUtil INSTANCE = new OptionsUtil();

  public static OptionsUtil getInstance() {
    return INSTANCE;
  }

  private OptionsUtil() {

  }

  /**
   * Copies the renderTo configuration from one {@link Options} object to
   * another. Null-safe.
   */
  public void copyRenderTo(Options from, Options to) {
    if (to.getChartOptions() == null) {
      to.setChartOptions(new ChartOptions());
    }
    to.getChartOptions().setRenderTo(from.getChartOptions().getRenderTo());
  }

  /**
   * Null-safe setter for the renderTo configuration.
   */
  public void setRenderTo(Options options, String renderTo) {
    if (options.getChartOptions() == null) {
      options.setChartOptions(new ChartOptions());
    }
    options.getChartOptions().setRenderTo(renderTo);
  }

  /**
   * Null-safe setter for the chart.events.load configuration.
   */
  public void setChartEventsLoad(Options options, Function function) {
    if (options.getChartOptions().getEvents() == null) {
      options.getChartOptions().setEvents(new Events());
    }
    if (options.getChartOptions().getEvents().getLoad() == null) {
      options.getChartOptions().getEvents().setLoad(function);
    }
  }

}
