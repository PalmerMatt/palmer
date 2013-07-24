package com.example.mysoft;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TwoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
	}
	
	public void sMessage(View v) {
	Log.i("Click", "Click button1");
	Intent i = new Intent(this, MainActivity.class);
	startActivity(i);
	}


}
