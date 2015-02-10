package com.example.champlaincs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Preuniversity extends Activity {

	String[] titles;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preuniversity);
		
		
		VideoView vid = (VideoView)findViewById(R.id.videoView1);
		MediaController mediaController = new MediaController(this);
		mediaController.setAnchorView(vid);
		Uri uri=Uri.parse("https://www.youtube.com/watch?v=fVDOB9mby_w");
		vid.setMediaController(mediaController);
		vid.setVideoURI(uri);
		vid.requestFocus();
		vid.start();
		
		
		
	ListView listView1 = (ListView) findViewById(R.id.listView1);
	titles=getResources().getStringArray(R.array.UniStringTitle);
	
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
             android.R.layout.simple_list_item_1, titles);
 
	listView1.setAdapter(adapter);
		
	 listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
    {

        public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) 
        {

            // Note: if the list was built "by hand" the id could be used.
            // As-is, though, each item has the same id

            TextView textView = (TextView) itemClicked;
            String strText = textView.getText().toString();
            Intent i = new Intent(getApplicationContext(),Option.class);
            if (strText.equalsIgnoreCase(getResources().getString(R.string.love_compsci))) 
            {
           	
           	i.putExtra("optionTitle", (getResources().getString(R.string.love_compsci)));
           	i.putExtra("optionText", (getResources().getString(R.string.blahblah))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.university_prep))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.university_prep)));
            	i.putExtra("optionText", (getResources().getString(R.string.blahblah))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            }
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.great_option))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.great_option)));
            	i.putExtra("optionText", (getResources().getString(R.string.blahblah))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.unique))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.unique)));
            	i.putExtra("optionText", (getResources().getString(R.string.blahblah))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.curriculum_description))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.curriculum_description)));
            	i.putExtra("optionText", (getResources().getString(R.string.blahblah))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
        }
    });
	
	}
	

}
