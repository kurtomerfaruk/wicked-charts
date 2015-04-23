**Supported by:** _wicked-charts-wicket14, wicked-charts-wicket15_, _wicked-charts-wicket6_, _wicked-charts-jsf21_

---


Themes make it possible to encapsulate certain attributes of a chart and reuse them in other charts. To create a theme, you need to create an instance of the [Theme](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/theme/Theme.html) class and configure it by calling its setters like this:

```
Theme myTheme = new Theme();
// define the first three colors for all charts
myTheme.addColor(new HexColor("#00FF00"));
myTheme.addColor(new HexColor("#FF0000"));
myTheme.addColor(new HexColor("#0000FF"));
// defining the titles
myTheme.setTitle("My Chart");
myTheme.setSubtitle("All charts using this theme will have this subtitle");
// ...
```

### Using Wicket ###
Using Wicket, you simply pass your theme to the [Chart](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/wicket6/highcharts/Chart.html) component when creating it:

```
Chart chart = new Chart("chart", options, theme);
add(chart);
```

### Using JSF ###
Using JSF, you can pass the theme via xhtml tag:

```
<wc:chart id="chart" options="#{backingbean.options}" theme="#{backingbean.theme}"/>
```