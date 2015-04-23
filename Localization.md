**Supported by:** _wicked-charts-wicket14, wicked-charts-wicket15_, _wicked-charts-wicket6_, _wicked-charts-jsf21_

---


Wicked Charts provides an API for localizing certain elements of your charts. The class to use for this is [LanguageOptions](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/options/LanguageOptions.html). To localize a chart you currently have to create a [Theme](https://wicked-charts.googlecode.com/svn/trunk/wicked-charts-parent/apidocs/com/googlecode/wickedcharts/highcharts/theme/Theme.html) and add your LanguageOptions via setLang().

Example Code to create a Theme with LanguageOptions:

```
Options options = ... // create your chart options
LanguageOptions lang = new LanguageOptions();
lang.setResetZoom("Reset Zoom");
lang.setLoading("Loading...");
// ... translate other words via setter methods...
Theme theme = new Theme();
theme.setLang(lang);
```

Then simply add the Theme to your chart as described on the [UsingThemes](UsingThemes.md) page.