package com.example.champlaincs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Preuniversity extends Activity {

	String[] titles;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preuniversity);
		
	
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
           	i.putExtra("optionText", (getResources().getString(R.string.love_compsci_ans))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.why_choose))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.why_choose)));
            	i.putExtra("optionText", (getResources().getString(R.string.why_choose_ans_math))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            }
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.skills_and_tools))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.skills_and_tools)));
            	i.putExtra("optionText", (getResources().getString(R.string.skills_and_tools_ans_math))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            }
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.university_prep))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.university_prep)));
            	i.putExtra("optionText", (getResources().getString(R.string.university_prep_ans))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            }
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.unique))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.unique)));
            	i.putExtra("optionText", (getResources().getString(R.string.unique_program_ans_math))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
            else if (strText.equalsIgnoreCase(getResources().getString(R.string.curriculum_description))) 
            {
            	i.putExtra("optionTitle", (getResources().getString(R.string.curriculum_description)));
            	i.putExtra("optionText", (getResources().getString(R.string.curriculum_description_ans_math))); //Missing Correct Text
           	//Missing the Image
           	startActivity(i);
            } 
        }
    });
	
	}
	
	public void goVideo(View view){
    	Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=t-bqN4wZ5sY"));
    	   startActivity(myIntent);
    }

}
