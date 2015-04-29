package com.ikankran.rajesh.cricplay;

import java.util.Arrays;
import java.util.Locale;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.PointLabelFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v13.app.FragmentPagerAdapter;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TextView;

public class GraphActivity extends TabActivity implements OnTabChangeListener{

	TabHost tabHost;
	
	private String[] tabs = { "Tournament 1", "Tournament 2", "Championship" };
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graph);
		
		// Get TabHost Refference
        tabHost = getTabHost();
         
        // Set TabChangeListener called when tab changed
        tabHost.setOnTabChangedListener(this);
     
        TabHost.TabSpec spec;
        Intent intent;
   
        /************* TAB1 ************/
        // Create  Intents to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, T1Fragment.class);
        spec = tabHost.newTabSpec("First").setIndicator("")
                      .setContent(intent);
      //Add intent to tab
        tabHost.addTab(spec);
        
        
        /************* TAB2 ************/
        intent = new Intent().setClass(this, T2Fragment.class);
        spec = tabHost.newTabSpec("Second").setIndicator("")
                      .setContent(intent);  
        tabHost.addTab(spec);
        
        /************* TAB3 ************/
        intent = new Intent().setClass(this, ChampFragment.class);
        spec = tabHost.newTabSpec("Third").setIndicator("")
                      .setContent(intent);  
        tabHost.addTab(spec);
        
     // Set drawable images to tab
        tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.t3ns);
        tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.t2ns);
           
        // Set Tab1 as Default tab and change image   
        tabHost.getTabWidget().setCurrentTab(0);
        tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.t1s);
	}

@Override
public void onTabChanged(String tabId) {
	// TODO Auto-generated method stub
	 for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
     {
         if(i==0)
             tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.t1ns);
         else if(i==1)
             tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.t2ns);
         else if(i==2)
             tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.t3ns);
     }
	 Log.i("tabs", "CurrentTab: "+tabHost.getCurrentTab());
     
	    if(tabHost.getCurrentTab()==0)
	        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.t1s);
	    else if(tabHost.getCurrentTab()==1)
	        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.t2s);
	    else if(tabHost.getCurrentTab()==2)
	        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.t3s);
	         
	    }
}

