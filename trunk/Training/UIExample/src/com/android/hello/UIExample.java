package com.android.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class UIExample extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Add a handle to UI components
        EditText nameEntry = (EditText)findViewById(R.id.name_entry);
        nameEntry.setText("Enter your name here");
        
        Button okButton = (Button)findViewById(R.id.ok);
        
        okButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setResult(RESULT_OK);
        		finish();
        	}
        });
    }
}