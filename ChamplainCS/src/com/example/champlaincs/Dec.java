package com.example.champlaincs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;




public class Dec extends Activity {

	String[] titles;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dec);
		
		
	ListView listView1 = (ListView) findViewById(R.id.listView1);
	titles=getResources().getStringArray(R.array.DecStringTitle);
	
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, titles);
 
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
             if (strText.equalsIgnoreCase(getResources().getString(R.string.why_choose))) 
             {
            	
            	i.putExtra("optionTitle", (getResources().getString(R.string.why_choose)));
            	i.putExtra("optionText", (getResources().getString(R.string.why_choose_ans)));
            	
            	//Missing the Image
            	startActivity(i);
             } 
             else if (strText.equalsIgnoreCase(getResources().getString(R.string.skills_and_tools))) 
             {
             	i.putExtra("optionTitle", (getResources().getString(R.string.skills_and_tools)));
             	i.putExtra("optionText", (getResources().getString(R.string.skills_and_tools_ans)));
            	//Missing the Image
            	startActivity(i);
             }
             else if (strText.equalsIgnoreCase(getResources().getString(R.string.best_work))) 
             {
             	i.putExtra("optionTitle", (getResources().getString(R.string.best_work)));
             	i.putExtra("optionText", (getResources().getString(R.string.best_work_ans)));
            	//Missing the Image
            	startActivity(i);
             } 
             else if (strText.equalsIgnoreCase(getResources().getString(R.string.curriculum_description))) 
             {
             	i.putExtra("optionTitle", (getResources().getString(R.string.curriculum_description)));
             	i.putExtra("optionText", (getResources().getString(R.string.curriculum_description_ans))); //Missing Correct Text
            	//Missing the Image
            	startActivity(i);
             } 
             else if (strText.equalsIgnoreCase(getResources().getString(R.string.unique_program))) 
             {
             	i.putExtra("optionTitle", (getResources().getString(R.string.unique_program)));
             	i.putExtra("optionText", (getResources().getString(R.string.unique_program_ans))); 
            	//Missing the Image
            	startActivity(i);
             } 
             else if (strText.equalsIgnoreCase(getResources().getString(R.string.high_placement))) 
             {
             	i.putExtra("optionTitle", (getResources().getString(R.string.high_placement)));
             	i.putExtra("optionText", (getResources().getString(R.string.high_placement_ans))); 
            	//Missing the Image
            	startActivity(i);
             }

         }
     });

 }
	
	public void goVideo(View view){
    	Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=wsmzqSJK7Nc"));
    	   startActivity(myIntent);
    }
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dec, menu);
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
}
