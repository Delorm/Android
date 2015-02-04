package com.example.champlaincs;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Option extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option);
		
		TextView title = (TextView)findViewById(R.id.title);
		TextView contentText = (TextView)findViewById(R.id.contentText);
		Bundle extras = getIntent().getExtras();
		
		if(extras!=null){
			title.setText(extras.getString("optionTitle"));
			contentText.setText(extras.getString("optionText"));
		}
		
	}

}
