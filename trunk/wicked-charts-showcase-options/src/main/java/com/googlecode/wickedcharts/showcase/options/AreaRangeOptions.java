package com.googlecode.wickedcharts.showcase.options;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.AxisType;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.Crosshair;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.Tooltip;
import com.googlecode.wickedcharts.highcharts.options.ZoomType;
import com.googlecode.wickedcharts.highcharts.options.series.RangeCoordinate;
import com.googlecode.wickedcharts.highcharts.options.series.RangeSeries;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;

public class AreaRangeOptions extends ShowcaseOptions {

  public AreaRangeOptions() {

    setChartOptions(new ChartOptions()
        .setType(SeriesType.AREARANGE)
        .setZoomType(ZoomType.X));

    setTitle(new Title("Temperature variation by day"));

    setxAxis(new Axis()
        .setType(AxisType.DATETIME));

    setyAxis(new Axis()
        .setTitle(new Title()
            .setText(null)));

    setTooltip(new Tooltip()
        .setXCrosshair(new Crosshair())
        .setShared(Boolean.TRUE)
        .setValueSuffix("°C"));

    setLegend(new Legend()
        .setEnabled(Boolean.FALSE));

    addSeries(new RangeSeries()
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1230771600000l, -5.8,
                0.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1230858000000l, -4.1,
                1.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1230944400000l, -0.5,
                4.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231030800000l, -8.9,
                -0.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231117200000l, -9.7,
                -3.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231203600000l, -3.4,
                3.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231290000000l, -3.9,
                -0.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231376400000l, -2.4,
                6.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231462800000l, 3.8,
                6.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231549200000l, 3.1,
                6.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231635600000l, 0.0,
                7.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231722000000l, 5.6,
                9.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231808400000l, 3.6,
                6.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231894800000l, -3.6,
                3.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1231981200000l, -6.0,
                -1.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232067600000l, -3.8,
                2.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232154000000l, 1.5,
                4.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232240400000l, 0.0,
                4.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232326800000l, -1.1,
                3.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232413200000l, 0.5,
                5.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232499600000l, 0.0,
                2.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232586000000l, -0.6,
                2.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232672400000l, 0.8,
                4.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232758800000l, 0.6,
                4.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232845200000l, -3.9,
                1.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1232931600000l, -4.3,
                2.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233018000000l, -6.1,
                -0.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233104400000l, -0.3,
                1.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233190800000l, -2.9,
                2.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233277200000l, -4.0,
                -1.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233363600000l, -4.4,
                -1.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233450000000l, -5.0,
                -2.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233536400000l, -5.2,
                -2.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233622800000l, -6.3,
                -0.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233709200000l, -5.4,
                -0.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233795600000l, -2.1,
                1.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233882000000l, -4.6,
                1.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1233968400000l, -5.4,
                0.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234054800000l, -8.7,
                -2.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234141200000l, -5.2,
                1.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234227600000l, -8.6,
                -2.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234314000000l, -8.5,
                0.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234400400000l, -4.8,
                1.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234486800000l, -8.3,
                1.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234573200000l, -8.6,
                1.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234659600000l, -3.2,
                1.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234746000000l, -0.7,
                4.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234832400000l, 0.2,
                3.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1234918800000l, 0.0,
                3.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235005200000l, 1.2,
                4.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235091600000l, 1.3,
                5.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235178000000l, 1.0,
                2.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235264400000l, 1.1,
                5.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235350800000l, 1.0,
                6.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235437200000l, 0.9,
                3.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235523600000l, 1.5,
                4.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235610000000l, 0.5,
                5.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235696400000l, -4.9,
                3.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235782800000l, -5.4,
                1.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235869200000l, -1.9,
                4.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1235955600000l, 0.9,
                8.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236042000000l, 1.7,
                8.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236128400000l, 0.0,
                9.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236214800000l, 2.5,
                7.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236301200000l, 2.1,
                5.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236387600000l, 1.5,
                6.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236474000000l, 0.6,
                7.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236560400000l, 1.9,
                9.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236646800000l, 1.8,
                7.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236733200000l, 0.2,
                8.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236819600000l, -0.3,
                5.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236906000000l, 1.6,
                8.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1236992400000l, -0.4,
                8.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237078800000l, -2.0,
                5.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237165200000l, 2.2,
                6.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237251600000l, 0.0,
                7.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237338000000l, 0.8,
                9.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237424400000l, -1.7,
                7.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237510800000l, -2.0,
                6.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237597200000l, -0.3,
                5.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237683600000l, 1.7,
                5.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237770000000l, -0.8,
                5.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237856400000l, -3.5,
                5.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1237942800000l, -2.6,
                5.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238029200000l, -0.7,
                8.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238115600000l, -2.8,
                6.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238202000000l, -2.9,
                6.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238288400000l, 0.3,
                7.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238371200000l, 0.5,
                7.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238457600000l, 1.6,
                4.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238544000000l, -1.4,
                7.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238630400000l, 2.8,
                6.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238716800000l, 3.4,
                12.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238803200000l, 0.6,
                13.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238889600000l, 5.5,
                8.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1238976000000l, 3.3,
                8.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239062400000l, 0.6,
                13.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239148800000l, 3.0,
                13.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239235200000l, 6.6,
                15.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239321600000l, 5.6,
                10.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239408000000l, 5.6,
                15.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239494400000l, 4.1,
                10.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239580800000l, 0.4,
                11.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239667200000l, 0.5,
                13.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239753600000l, 3.8,
                15.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239840000000l, 6.0,
                11.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1239926400000l, 3.9,
                13.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240012800000l, 0.8,
                14.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240099200000l, 2.9,
                17.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240185600000l, 7.1,
                12.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240272000000l, 2.4,
                12.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240358400000l, 4.7,
                12.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240444800000l, 2.0,
                16.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240531200000l, 9.5,
                17.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240617600000l, 3.4,
                16.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240704000000l, 6.7,
                19.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240790400000l, 4.9,
                15.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240876800000l, 8.4,
                15.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1240963200000l, 4.1,
                18.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241049600000l, 6.6,
                19.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241136000000l, 8.7,
                21.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241222400000l, 9.2,
                16.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241308800000l, 6.2,
                12.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241395200000l, 0.0,
                13.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241481600000l, 4.5,
                11.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241568000000l, 3.2,
                14.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241654400000l, 3.1,
                13.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241740800000l, 6.4,
                14.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241827200000l, 5.0,
                13.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1241913600000l, 4.8,
                11.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242000000000l, 3.5,
                13.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242086400000l, 4.5,
                15.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242172800000l, 2.0,
                17.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242259200000l, 4.3,
                18.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242345600000l, 4.5,
                18.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242432000000l, 8.0,
                20.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242518400000l, 7.4,
                20.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242604800000l, 8.4,
                17.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242691200000l, 8.3,
                15.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242777600000l, 8.3,
                17.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242864000000l, 6.7,
                17.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1242950400000l, 7.6,
                17.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243036800000l, 6.6,
                17.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243123200000l, 8.7,
                17.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243209600000l, 8.9,
                17.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243296000000l, 8.4,
                11.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243382400000l, 5.9,
                14.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243468800000l, 5.1,
                16.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243555200000l, 8.3,
                16.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243641600000l, 6.2,
                22.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243728000000l, 7.8,
                22.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243814400000l, 7.3,
                21.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243900800000l, 8.7,
                16.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1243987200000l, 7.3,
                13.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244073600000l, 3.9,
                15.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244160000000l, 6.4,
                17.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244246400000l, 2.9,
                17.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244332800000l, 3.9,
                17.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244419200000l, 6.5,
                16.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244505600000l, 8.0,
                14.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244592000000l, 7.8,
                16.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244678400000l, 8.6,
                15.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244764800000l, 8.2,
                18.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244851200000l, 9.5,
                17.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1244937600000l, 5.7,
                18.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245024000000l, 7.0,
                16.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245110400000l, 4.3,
                15.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245196800000l, 3.6,
                19.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245283200000l, 10.8,
                15.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245369600000l, 8.6,
                16.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245456000000l, 10.7,
                17.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245542400000l, 9.7,
                18.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245628800000l, 9.8,
                20.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245715200000l, 12.8,
                19.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245801600000l, 8.6,
                24.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245888000000l, 10.9,
                26.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1245974400000l, 13.5,
                28.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246060800000l, 12.5,
                23.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246147200000l, 14.0,
                28.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246233600000l, 14.9,
                29.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246320000000l, 16.9,
                22.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246406400000l, 14.3,
                27.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246492800000l, 14.5,
                27.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246579200000l, 15.5,
                29.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246665600000l, 16.7,
                30.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246752000000l, 16.5,
                25.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246838400000l, 17.8,
                25.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1246924800000l, 13.5,
                24.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247011200000l, 10.5,
                21.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247097600000l, 9.2,
                23.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247184000000l, 11.6,
                21.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247270400000l, 10.7,
                23.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247356800000l, 11.0,
                23.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247443200000l, 11.6,
                23.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247529600000l, 11.8,
                20.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247616000000l, 12.6,
                22.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247702400000l, 13.6,
                19.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247788800000l, 11.4,
                22.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247875200000l, 13.2,
                25.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1247961600000l, 14.2,
                21.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248048000000l, 13.1,
                17.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248134400000l, 12.2,
                15.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248220800000l, 12.0,
                20.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248307200000l, 12.0,
                17.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248393600000l, 12.7,
                18.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248480000000l, 12.4,
                19.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248566400000l, 12.6,
                19.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248652800000l, 11.9,
                20.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248739200000l, 11.0,
                19.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248825600000l, 10.8,
                17.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248912000000l, 11.8,
                18.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1248998400000l, 10.8,
                16.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249084800000l, 9.0,
                19.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249171200000l, 11.0,
                20.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249257600000l, 12.6,
                22.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249344000000l, 14.5,
                22.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249430400000l, 11.9,
                24.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249516800000l, 16.0,
                21.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249603200000l, 13.8,
                24.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249689600000l, 13.7,
                21.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249776000000l, 13.6,
                22.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249862400000l, 10.5,
                22.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1249948800000l, 12.8,
                18.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250035200000l, 11.9,
                18.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250121600000l, 10.9,
                16.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250208000000l, 8.8,
                16.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250294400000l, 7.3,
                13.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250380800000l, 10.7,
                14.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250467200000l, 12.3,
                17.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250553600000l, 9.9,
                18.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250640000000l, 7.7,
                16.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250726400000l, 12.7,
                26.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250812800000l, 12.8,
                20.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250899200000l, 10.6,
                17.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1250985600000l, 11.3,
                18.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251072000000l, 11.3,
                13.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251158400000l, null,
                null))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251244800000l, 10.0,
                15.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251331200000l, 9.6,
                16.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251417600000l, 12.7,
                13.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251504000000l, 11.1,
                17.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251590400000l, 11.9,
                15.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251676800000l, 10.8,
                12.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251763200000l, 11.5,
                14.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251849600000l, 10.0,
                13.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1251936000000l, 9.3,
                16.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252022400000l, 11.1,
                18.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252108800000l, 10.4,
                11.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252195200000l, null,
                null))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252281600000l, 10.8,
                14.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252368000000l, 9.0,
                13.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252454400000l, 11.4,
                16.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252540800000l, 9.7,
                15.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252627200000l, 10.4,
                14.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252713600000l, 10.0,
                13.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252800000000l, 8.3,
                17.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252886400000l, 6.1,
                15.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1252972800000l, 5.5,
                14.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253059200000l, 8.5,
                13.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253145600000l, 8.8,
                12.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253232000000l, 9.4,
                15.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253318400000l, 6.7,
                17.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253404800000l, 9.3,
                14.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253491200000l, 8.4,
                15.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253577600000l, 9.5,
                15.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253664000000l, 7.7,
                11.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253750400000l, 7.1,
                11.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253836800000l, 10.0,
                15.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1253923200000l, 13.9,
                16.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254009600000l, 8.0,
                15.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254096000000l, 4.4,
                8.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254182400000l, 4.7,
                6.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254268800000l, null,
                null))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254355200000l, null,
                null))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254441600000l, 3.6,
                3.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254528000000l, 3.0,
                6.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254614400000l, 2.8,
                9.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254700800000l, 1.5,
                7.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254787200000l, 0.5,
                5.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254873600000l, 3.3,
                9.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1254960000000l, 3.4,
                5.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255046400000l, 0.7,
                6.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255132800000l, -2.5,
                6.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255219200000l, 0.4,
                8.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255305600000l, 0.2,
                9.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255392000000l, -2.5,
                5.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255478400000l, -3.1,
                5.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255564800000l, 2.3,
                8.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255651200000l, 4.4,
                10.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255737600000l, 0.2,
                7.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255824000000l, -1.2,
                7.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255910400000l, 2.8,
                6.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1255996800000l, -0.8,
                7.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256083200000l, 1.0,
                9.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256169600000l, 1.3,
                4.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256256000000l, 2.9,
                11.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256342400000l, 4.7,
                9.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256428800000l, 3.3,
                10.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256518800000l, 0.0,
                7.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256605200000l, 0.0,
                2.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256691600000l, -1.1,
                5.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256778000000l, -1.3,
                4.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256864400000l, 0.3,
                4.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1256950800000l, -0.7,
                4.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257037200000l, 4.5,
                7.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257123600000l, 0.0,
                4.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257210000000l, 0.0,
                0.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257296400000l, 0.0,
                6.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257382800000l, -2.2,
                5.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257469200000l, -2.6,
                1.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257555600000l, -1.7,
                10.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257642000000l, 0.0,
                5.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257728400000l, -1.9,
                0.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257814800000l, -2.6,
                -0.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257901200000l, -2.6,
                1.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1257987600000l, -4.4,
                -1.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258074000000l, -5.2,
                0.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258160400000l, null,
                null))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258246800000l, 1.3,
                8.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258333200000l, -0.1,
                3.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258419600000l, 1.7,
                5.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258506000000l, 4.5,
                6.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258592400000l, 4.8,
                5.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258678800000l, 4.9,
                10.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258765200000l, 2.4,
                8.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258851600000l, 2.4,
                4.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1258938000000l, 1.9,
                5.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259024400000l, 2.9,
                5.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259110800000l, 2.9,
                4.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259197200000l, 3.9,
                7.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259283600000l, 0.8,
                5.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259370000000l, 0.0,
                4.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259456400000l, 1.5,
                3.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259542800000l, -3.8,
                1.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259629200000l, -3.3,
                1.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259715600000l, -2.8,
                -0.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259802000000l, -2.7,
                3.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259888400000l, -0.7,
                4.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1259974800000l, 0.3,
                6.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260061200000l, 2.9,
                9.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260147600000l, 0.0,
                6.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260234000000l, 0.6,
                2.8))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260320400000l, 0.1,
                5.1))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260406800000l, 2.8,
                3.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260493200000l, -1.2,
                2.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260579600000l, -4.0,
                -0.4))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260666000000l, -0.7,
                0.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260752400000l, 0.5,
                1.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260838800000l, -1.0,
                1.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1260925200000l, -7.8,
                -1.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261011600000l, -11.9,
                -7.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261098000000l, -13.5,
                -7.9))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261184400000l, -7.8,
                -1.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261270800000l, -11.2,
                -0.6))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261357200000l, -13.1,
                -7.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261443600000l, -13.2,
                -5.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261530000000l, -10.9,
                -7.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261616400000l, -8.4,
                -1.5))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261702800000l, -6.1,
                -1.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261789200000l, -2.6,
                -1.2))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261875600000l, -2.9,
                0.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1261962000000l, -2.7,
                0.7))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1262048400000l, -10.8,
                -1.3))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1262134800000l, -11.1,
                -8.0))
        .addPoint(
            new RangeCoordinate<Number, Number, Number>(1262221200000l, -12.2,
                -6.5)));

  }

  @Override
  public String getLabel() {
    return "Area range";
  }

}
