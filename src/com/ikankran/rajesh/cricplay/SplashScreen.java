package com.ikankran.rajesh.cricplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		Thread background = new Thread() {
			public void run() {
				try {
					sleep(2000);
					Intent loginScreen = new Intent(getBaseContext(),
							LoginActivity.class);
					startActivity(loginScreen);
					finish();
				} catch (Exception e) {
				}
			}
		};
		background.start();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
	}
}
