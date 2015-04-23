# Global Configuration #

**Supported by:** _wicked-charts-wicket14, wicked-charts-wicket15, wicked-charts-wicket6_

---


Global configuration is a feature of Highcharts to define configration parameters globally for all charts on a page.

## Using Wicket ##
Simply add a Global configuration to a chart. The Wicket component will automatically call the required javascript to tell Highcharts to use the global configuration.

```

options.setGlobal(new Global()
  .setUTC(Boolean.FALSE));

```

Note that if multiple charts on the same page each define a Global configuration, the last one will win and override all others!

## Using JSF ##
Adding a Global configuration currently has no effect in JSF. You have to define global configuration manually in javascript:

```
Highcharts.setOptions({                                          
    global : {
              useUTC : false
             }
  });
```