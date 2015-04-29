package com.ikankran.rajesh.cricplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button graphButton ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		graphButton = (Button)(findViewById(R.id.graph));
		
		graphButton.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent graphView = new Intent(getBaseContext(),GraphActivity.class);
				startActivity(graphView);
				
				
			}
		});
	}
}
