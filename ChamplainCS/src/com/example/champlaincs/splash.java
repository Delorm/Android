package com.example.champlaincs;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstaceState){
		
		super.onCreate(savedInstaceState);
		setContentView(R.layout.splash);
		
		int secondsDelayed=10000;
		new Handler().postDelayed(new Runnable(){
			
			public void run(){
				startActivity(new Intent(splash.this,Dec.class));
				finish();
			}
			
			
		}, secondsDelayed);
		
	}
	
	
	
}
