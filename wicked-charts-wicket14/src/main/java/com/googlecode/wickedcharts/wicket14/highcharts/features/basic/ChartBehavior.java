package com.googlecode.wickedcharts.wicket14.highcharts.features.basic;

import java.text.MessageFormat;

import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.html.IHeaderResponse;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.processing.Feature;
import com.googlecode.wickedcharts.highcharts.options.processing.FeatureCheckingOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.IOptionsProcessor;
import com.googlecode.wickedcharts.highcharts.options.processing.OptionsProcessorContext;
import com.googlecode.wickedcharts.highcharts.options.util.OptionsUtil;
import com.googlecode.wickedcharts.wicket14.JavaScriptResourceRegistry;
import com.googlecode.wickedcharts.wicket14.highcharts.Chart;
import com.googlecode.wickedcharts.wicket14.highcharts.JsonRendererFactory;
import com.googlecode.wickedcharts.wicket14.highcharts.features.drilldown.DrilldownProcessor;
import com.googlecode.wickedcharts.wicket14.highcharts.features.global.GlobalProcessor;

public class ChartBehavior extends AbstractBehavior {
	private static final long serialVersionUID = 1L;

	private final Chart chart;
	
	private static final Feature[] SUPPORTED_FEATURES = new Feature[] {

		Feature.DRILLDOWN,

		Feature.GLOBAL,

		};

	/**
	 * Constructor.
	 * 
	 * @param options
	 *            the options for the chart. The {@link Option} class is very
	 *            similar in structure to the Highcharts API reference, see
	 *            http://www.highcharts.com/ref/.
	 */
	public ChartBehavior(final Chart container) {
		this.chart = container;
	}

	private void addTheme(final IHeaderResponse response,
			final JsonRenderer renderer) {
		if (this.chart.getTheme() != null) {
			response.renderOnDomReadyJavascript(MessageFormat.format(
					"Highcharts.setOptions({0});",
					renderer.toJson(this.chart.getTheme())));
		} else if (this.chart.getThemeUrl() != null) {
			response.renderJavascriptReference(this.chart.getThemeUrl());
		} else if (this.chart.getThemeReference() != null) {
			response.renderJavascriptReference(this.chart.getThemeReference());
		}
	}

	/**
	 * Includes the javascript that calls the Highcharts library to visualize
	 * the chart.
	 * 
	 * @param response
	 *            the Wicket HeaderResponse
	 * @param options
	 *            the options containing the data to display
	 * @param renderer
	 *            the JsonRenderer responsible for rendering the options
	 * @param markupId
	 *            the DOM ID of the chart component.
	 */
	protected void includeChartJavascript(final IHeaderResponse response,
			final Options options, final JsonRenderer renderer,
			final String markupId) {
		String chartVarname = markupId;
		String optionsVarname = markupId + "Options";
		response.renderOnDomReadyJavascript(MessageFormat.format(
				"var {0} = {1};var {2} = new Highcharts.Chart({0});",
				optionsVarname, renderer.toJson(options), chartVarname));
	}

	private void includeJavascriptDependencies(final IHeaderResponse response,
			final Options options) {
		JavaScriptResourceRegistry.getInstance().getJQueryEntry()
				.addToHeaderResponse(response);
		JavaScriptResourceRegistry.getInstance().getHighchartsEntry()
				.addToHeaderResponse(response);
		if (OptionsUtil.needsExportingJs(options)) {
			JavaScriptResourceRegistry.getInstance()
					.getHighchartsExportingEntry()
					.addToHeaderResponse(response);
		}
		if (OptionsUtil.needsHighchartsMoreJs(options)) {
			JavaScriptResourceRegistry.getInstance().getHighchartsMoreEntry()
					.addToHeaderResponse(response);
		}
	}

	@Override
	public void renderHead(final IHeaderResponse response) {

		this.chart.setOutputMarkupId(true);
		Options options = this.chart.getOptions();
		final String id = this.chart.getMarkupId();
		OptionsUtil.getInstance().setRenderTo(options, id);

		JsonRenderer renderer = JsonRendererFactory.getInstance()
				.getRenderer();
		includeJavascriptDependencies(response, options);
		addTheme(response, renderer);

		OptionsProcessorContext context = new OptionsProcessorContext(options);
		
		IOptionsProcessor featureProcessor = new FeatureCheckingOptionsProcessor(SUPPORTED_FEATURES);
		featureProcessor.processOptions(this.chart.getOptions(), context);

		DrilldownProcessor drilldownProcessor = new DrilldownProcessor(
				this.chart, response);
		drilldownProcessor.processOptions(options, context);

		GlobalProcessor globalProcessor = new GlobalProcessor(
				response);
		globalProcessor.processOptions(options, context);

		includeChartJavascript(response, options, renderer, id);
	}
}
