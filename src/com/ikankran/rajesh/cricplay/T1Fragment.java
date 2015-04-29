package com.ikankran.rajesh.cricplay;

import java.util.Arrays;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.PointLabelFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class T1Fragment extends Activity {
	
	private XYPlot plot;
	
	
	/*@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_t1);
		plot = (XYPlot) findViewById(R.id.mySimpleXYPlot);
	    Number[] series1Numbers = {1, 8, 5, 2, 7, 4};
	    Number[] series2Numbers = {4, 6, 3, 8, 2, 10};
	     
	     
	     XYSeries series1 = new SimpleXYSeries(
	                Arrays.asList(series1Numbers),          // SimpleXYSeries takes a List so turn our array into a List
	                SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, // Y_VALS_ONLY means use the element index as the x value
	                "Series1");
	     
	     XYSeries series2 = new SimpleXYSeries(Arrays.asList(series2Numbers), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Series2");
	     LineAndPointFormatter series1Format = new LineAndPointFormatter();
	        series1Format.setPointLabelFormatter(new PointLabelFormatter());
	        series1Format.configure(getApplicationContext(),
	                R.xml.line_point_formatter_with_plf1);
	        // add a new series' to the xyplot:
	        plot.addSeries(series1, series1Format);
	 
	        // same as above:
	        LineAndPointFormatter series2Format = new LineAndPointFormatter();
	        series2Format.setPointLabelFormatter(new PointLabelFormatter());
	        series2Format.configure(getApplicationContext(),
	                R.xml.line_point_formatter_with_plf2);
	        plot.addSeries(series2, series2Format);
	 
	        // reduce the number of range labels
	        plot.setTicksPerRangeLabel(3);
	        plot.getGraphWidget().setDomainLabelOrientation(-45);
	     
	}
*/	
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_t1);
		WebView webview = (WebView) findViewById(R.id.webView1);
	 String content = "<html>"
	 + "  <head>"
	 + "    <script type=\"text/javascript\" src=\"jsapi.js\"></script>"
	 + "    <script type=\"text/javascript\">"
	 + "      google.load(\"visualization\", \"1\", {packages:[\"corechart\"]});"
	 + "      google.setOnLoadCallback(drawChart);"
	 + "      function drawChart() {"
	 + "        var data = google.visualization.arrayToDataTable(["
	 + "          ['Players', 'Score'],"
	 + "          ['Jayant',  03],"
	 + "          ['Rajesh',  07],"
	 + "          ['Niraj',  20],"
	 + "          ['Rohan',  80],"
	 + "          ['Jayant',  30],"
	 + "          ['Rajesh',  57],"
	 + "          ['Niraj',  60],"
	 + "          ['Rohan',  09],"
	 + "          ['Jayant',  07],"
	 + "          ['Rajesh',  55],"
	 + "          ['Rajesh',  57],"
	 + "          ['Niraj',  60],"
	 + "          ['Rohan',  09],"
	 + "          ['Jayant',  07],"
	 + "          ['Rajesh',  55],"
	 + "          ['Rajesh',  57],"
	 + "          ['Niraj',  60],"
	 + "          ['Rohan',  09],"
	 + "          ['Jayant',  07],"
	 + "          ['Rajesh',  55],"
	 + "          ['Rajesh',  57],"
	 + "          ['Niraj',  60],"
	 + "          ['Rohan',  09],"
	 + "          ['Jayant',  07],"
	 + "          ['Rajesh',  55],"
	 + "          ['Rajesh',  57],"
	 + "          ['Niraj',  60],"
	 + "          ['Rohan',  09],"
	 + "          ['Jayant',  07],"
	 + "          ['Rajesh',  55],"
	 + "          ['Niraj',  26],"
	 + "          ['Rohan',  78],"
	 + "          ['Jayant',  13],"
	 + "          ['Rajesh',  47],"
	 + "          ['Niraj',  29],"
	 + "          ['Rohan',  49]"

	 + "        ]);"
	 + "        var options = {"
	 + "          title: 'Players Correct Predictions', bars: 'horizontal',"
	 + " chartArea : {"
	 + "	top : 50,"
	+ "		right : 0,"
	+ "		bottom : 0,"
	+ "		width : '60%'"
	+ "	},"
	 + "          hAxis: {title: 'Score'},vAxis : {title : 'Players'}"
	 + "        };"
	 + "        var chart = new google.visualization.BarChart(document.getElementById('chart_div'));"
	 + "        chart.draw(data, options);"
	 + "      }"
	 + "    </script>"
	 + "  </head>"
	 + "  <body>"
	 + "    <div id=\"chart_div\" style=\"width: 100%; height: 1000px;\"></div>"
	 + "  </body>" + "</html>";

	 WebSettings webSettings = webview.getSettings();
	 webSettings.setJavaScriptEnabled(true);
	 webview.requestFocusFromTouch();
	 webview.loadDataWithBaseURL( "file:///android_asset/", content, "text/html", "utf-8", null );
	 
	}
	}
