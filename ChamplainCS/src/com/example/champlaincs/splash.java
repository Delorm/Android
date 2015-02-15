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
		
		Thread logoTimer = new Thread(){
			
			public void run(){
				try{
					sleep(2000);
					Intent mainActivityIntent = new Intent("com.example.champlaincs.ACTIVITY_MAIN");
					startActivity(mainActivityIntent);
				} 
				
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally{
					finish();
				}
			}
		};
		
		logoTimer.start();
		
/*		int secondsDelayed=10000;
		new Handler().postDelayed(new Runnable(){
			
			public void run(){
				startActivity(new Intent(splash.this,MainActivity.class));
				finish();
			}
			
			
		}, secondsDelayed);*/
		
	}
	
	
	
}
