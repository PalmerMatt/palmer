package com.example.mysoft;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TwoActivity extends Activity {
	Button button2;
	int count=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		Log.i("set", "button2");
		button2 = (Button)findViewById(R.id.button2);

button2.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View v) {
		if(v.equals(findViewById(R.id.button2))){
			Log.i("click", "button2");
		TextView vw =(TextView)findViewById(R.id.textView1);
		vw.setText("Click button " + ++count );
	}}
});
	}

	
	public void sMessage(View v) {
	Log.i("Click", "Click button1");
	Intent i = new Intent(this, MainActivity.class);
	startActivity(i);
	}	
	
	
}
