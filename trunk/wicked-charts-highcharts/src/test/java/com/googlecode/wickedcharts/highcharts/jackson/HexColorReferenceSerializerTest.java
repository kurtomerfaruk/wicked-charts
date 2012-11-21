/**
 * Copyright 2012 Tom Hombergs (tom.hombergs@gmail.com)
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
package com.googlecode.wickedcharts.highcharts.jackson;

import org.junit.Assert;
import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.color.ColorReference;
import com.googlecode.wickedcharts.highcharts.options.color.HexColor;

public class HexColorReferenceSerializerTest {

  @Test
  public void testWithHexString() {
    // given
    ColorReference color = new HexColor("#ff0000");
    JsonRenderer renderer = new JsonRenderer();

    // when
    String json = renderer.toJson(color);

    // then
    Assert.assertEquals("\"#ff0000\"", json);
  }

  @Test
  public void testWithHexStringAndBrightness() {
    // given
    ColorReference color = new HexColor("#ff0000");
    color = color.brighten(0.2f);
    JsonRenderer renderer = new JsonRenderer();

    // when
    String json = renderer.toJson(color);

    // then
    Assert.assertEquals("Highcharts.Color(\"#ff0000\").brighten(0.20).get()",
        json);
  }

}
