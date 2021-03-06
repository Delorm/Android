package com.example.champlaincs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends Activity {
	

	ImageButton btn = (ImageButton)findViewById(R.id.decButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                btn.setBackgroundResource(R.drawable.pressed);
            }
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void goDEC(View view){
    	Intent myIntent = new Intent(this, Dec.class);
    	   startActivity(myIntent);
    }
    
    public void goUni(View view){
    	Intent myIntent = new Intent(this, Preuniversity.class);
    	   startActivity(myIntent);
    }
    
    public void goFacebook(View view){
    	Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Champlain.College.Saint.Lambert"));
    	   startActivity(myIntent);
    }
    
    public void goTwitter(View view){
    	Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ChamplainSL"));
    	   startActivity(myIntent);
    }
    
    public void goInstagram(View view){
    	Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/champlaincollegesl"));
    	   startActivity(myIntent);
    }
    
    
    
    
    
    
    
    
}
