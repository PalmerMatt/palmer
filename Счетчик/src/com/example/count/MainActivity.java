package com.example.count;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;


public class MainActivity extends Activity {
	int count;
	Button button1;
	Button button2;
	Button button3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		button3 = (Button)findViewById(R.id.button3);
		
		button1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				if(v.equals(findViewById(R.id.button1))){
					TextView vw = (TextView)findViewById(R.id.textView1);
							vw.setText(""+ ++count);
					
				}
				
			}
		});
		button2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			if (v.equals(findViewById(R.id.button2))){
				TextView vw = (TextView)findViewById(R.id.textView1);
				vw.setText("");
				count=0;
				
			}
				
			}
		});
		button3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			if (v.equals(findViewById(R.id.button3))){
				TextView vw = (TextView)findViewById(R.id.textView1);
				vw.setText(""+ --count);
			}
				
			}
		});
		
	}



}
