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
package com.googlecode.wickedcharts.highcharts.options.livedata;

import java.text.MessageFormat;

import com.googlecode.wickedcharts.highcharts.options.Function;
import com.googlecode.wickedcharts.highcharts.options.livedata.LiveDataSeries;

/**
 * This javascript function starts a javascript timer to update a
 * {@link LiveDataSeries}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Wicket6LiveDataFunction extends Function {

  private static final long serialVersionUID = 1L;

  public Wicket6LiveDataFunction(Wicket6LiveDataAjaxBehavior behavior) {
    String interval = String.valueOf(behavior.getSeries().getUpdateIntervalMs());
    String intervalVarName = behavior.getIntervalJavaScriptVarName();
    String functionBody = "var series = this.series[0];\n";
    functionBody += MessageFormat.format("if(!(typeof {0} === \"undefined\"))'{'clearInterval({0});'}'", intervalVarName);
    functionBody += intervalVarName + " = setInterval(function(series){\n";
    functionBody += behavior.getCallbackScript();
    functionBody += "}, " + interval + ");";
    setFunction(functionBody);
  }

}
