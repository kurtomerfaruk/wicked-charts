# Using a different version of jQuery and Highcharts #

**Supported by:** _wicked-charts-wicket14, wicked-charts-wicket15, wicked-charts-wicket6_

---


Sometimes, it may be necessary to override the javascript depencencies that come with the Wicked Charts components.

## Using Wicket ##
The Wicket components manage their javascript dependencies themselves. If you need to change one of the dependencies, simply call one of the setter methods on JavaScriptResourceRegistry:

```

JavaScriptResourceRegistry.getInstance().setHighchartsReference(...);
JavaScriptResourceRegistry.getInstance().setHighchartsExportingReference(...);
JavaScriptResourceRegistry.getInstance().setHighchartsMoreReference(...);
JavaScriptResourceRegistry.getInstance().setJQueryReference(...);

```

## Using JSF ##
Using JSF, you have to manually include the javascript dependencies in your HTML, so you can define which javascript files to include.