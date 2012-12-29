package com.googlecode.wickedcharts.showcase.ie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.PropertyModel;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.showcase.options.AngularGaugeOptions;
import com.googlecode.wickedcharts.showcase.options.AreaInvertedAxisOptions;
import com.googlecode.wickedcharts.showcase.options.AreaMissingOptions;
import com.googlecode.wickedcharts.showcase.options.AreaRangeOptions;
import com.googlecode.wickedcharts.showcase.options.AreaSplineOptions;
import com.googlecode.wickedcharts.showcase.options.AreaWithNegativeValuesOptions;
import com.googlecode.wickedcharts.showcase.options.BarWithNegativeStackOptions;
import com.googlecode.wickedcharts.showcase.options.BasicAreaOptions;
import com.googlecode.wickedcharts.showcase.options.BasicBarOptions;
import com.googlecode.wickedcharts.showcase.options.BasicColumnOptions;
import com.googlecode.wickedcharts.showcase.options.BasicLineOptions;
import com.googlecode.wickedcharts.showcase.options.BasicPieOptions;
import com.googlecode.wickedcharts.showcase.options.BubbleChartOptions;
import com.googlecode.wickedcharts.showcase.options.ClickToAddAPointOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnRangeOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnWithDrilldownOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnWithNegativeValuesOptions;
import com.googlecode.wickedcharts.showcase.options.ColumnWithRotatedLabelsOptions;
import com.googlecode.wickedcharts.showcase.options.ComboOptions;
import com.googlecode.wickedcharts.showcase.options.DonutOptions;
import com.googlecode.wickedcharts.showcase.options.LineWithDataLabelsOptions;
import com.googlecode.wickedcharts.showcase.options.LogarithmicAxisOptions;
import com.googlecode.wickedcharts.showcase.options.PercentageAreaOptions;
import com.googlecode.wickedcharts.showcase.options.PieWithGradientOptions;
import com.googlecode.wickedcharts.showcase.options.PieWithLegendOptions;
import com.googlecode.wickedcharts.showcase.options.PolarOptions;
import com.googlecode.wickedcharts.showcase.options.ScatterPlotOptions;
import com.googlecode.wickedcharts.showcase.options.ScatterWithRegressionLineOptions;
import com.googlecode.wickedcharts.showcase.options.SpiderwebOptions;
import com.googlecode.wickedcharts.showcase.options.SplineUpdatingOptions;
import com.googlecode.wickedcharts.showcase.options.SplineWithInvertedAxisOptions;
import com.googlecode.wickedcharts.showcase.options.SplineWithPlotBandsOptions;
import com.googlecode.wickedcharts.showcase.options.SplineWithSymbolsOptions;
import com.googlecode.wickedcharts.showcase.options.StackedAndGroupedColumnOptions;
import com.googlecode.wickedcharts.showcase.options.StackedAreaOptions;
import com.googlecode.wickedcharts.showcase.options.StackedBarOptions;
import com.googlecode.wickedcharts.showcase.options.StackedColumnOptions;
import com.googlecode.wickedcharts.showcase.options.StackedPercentageOptions;
import com.googlecode.wickedcharts.showcase.options.TimeDataWithIrregularIntervalsOptions;
import com.googlecode.wickedcharts.showcase.options.WindroseOptions;
import com.googlecode.wickedcharts.showcase.options.ZoomableTimeSeriesOptions;
import com.googlecode.wickedcharts.showcase.options.base.ShowcaseOptions;
import com.googlecode.wickedcharts.wicket6.highcharts.Chart;

/**
 * This page has been build to show all Options in a basic design without jquery
 * UI and such, so that it can be viewed in all browsers without hassle.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class SimplePage extends WebPage {

	private static final long serialVersionUID = 1L;

	private Options selectedOptions;

	private static List<ShowcaseOptions> choices = Arrays.asList(new AreaInvertedAxisOptions(),
			new AreaMissingOptions(), new AreaSplineOptions(), new AreaWithNegativeValuesOptions(),
			new BarWithNegativeStackOptions(), new BasicAreaOptions(), new BasicBarOptions(), new BasicColumnOptions(),
			new BasicLineOptions(), new BasicPieOptions(), new BubbleChartOptions(), new ColumnWithDrilldownOptions(),
			new ColumnWithNegativeValuesOptions(), new ColumnWithRotatedLabelsOptions(), new ComboOptions(),
			new DonutOptions(), new LineWithDataLabelsOptions(), new LogarithmicAxisOptions(),
			new PercentageAreaOptions(), new PieWithGradientOptions(), new PieWithLegendOptions(), new PolarOptions(),
			new ScatterPlotOptions(), new SplineUpdatingOptions(), new SplineWithInvertedAxisOptions(),
			new SplineWithPlotBandsOptions(), new SplineWithSymbolsOptions(), new StackedAndGroupedColumnOptions(),
			new StackedAreaOptions(), new StackedBarOptions(), new StackedColumnOptions(),
			new StackedPercentageOptions(), new TimeDataWithIrregularIntervalsOptions(),
			new ZoomableTimeSeriesOptions(), new AngularGaugeOptions(), new SpiderwebOptions(), new WindroseOptions(),
			new ScatterWithRegressionLineOptions(), new ColumnRangeOptions(), new AreaRangeOptions(),
			new ClickToAddAPointOptions());

	static {

		Collections.sort(SimplePage.choices, new Comparator<ShowcaseOptions>() {

			@Override
			public int compare(ShowcaseOptions o1, ShowcaseOptions o2) {
				return o1.getLabel().compareTo(o2.getLabel());
			}
		});

	}

	public SimplePage() {
		this(SimplePage.choices.get(0));
	}

	public SimplePage(Options options) {
		this.selectedOptions = options;

		// create fresh instance of SplineUpdatingOptions for correct time ticks
		if (this.selectedOptions instanceof SplineUpdatingOptions) {
			((SplineUpdatingOptions) this.selectedOptions).refresh();
		}

		final Chart chart = new Chart("chart", this.selectedOptions);
		this.add(chart);

		Form<Void> form = new Form<Void>("form") {
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit() {
				this.setResponsePage(new SimplePage(SimplePage.this.selectedOptions));
			}
		};
		this.add(form);

		final DropDownChoice<ShowcaseOptions> dropdown = new DropDownChoice<ShowcaseOptions>("chartSelect",
				new PropertyModel<ShowcaseOptions>(this, "selectedOptions"), SimplePage.choices);
		form.add(dropdown);

		dropdown.setChoiceRenderer(new IChoiceRenderer<ShowcaseOptions>() {

			private static final long serialVersionUID = 1L;

			@Override
			public Object getDisplayValue(ShowcaseOptions object) {
				return object.getLabel();
			}

			@Override
			public String getIdValue(ShowcaseOptions object, int index) {
				return String.valueOf(index);
			}
		});
	}
}
