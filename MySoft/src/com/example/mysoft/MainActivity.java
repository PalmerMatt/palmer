package com.example.mysoft;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void sMessage(View v) {
	Log.i("Click", "Click button1");
	Intent i = new Intent(this, TwoActivity.class);
	startActivity(i);
	}
	
	public void tMessage(View v) {
		TextView textView = (TextView)findViewById(R.id.textView1);
		textView.setText("MyText"+" Count click " + ++i);
	}

}
