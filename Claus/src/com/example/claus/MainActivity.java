package com.example.claus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}
	
	@Override
	public void onClick(View btn) {
		if (btn.equals(this.findViewById(R.id.button1))) {
			Intent i = new Intent(this, DisplayMessageActivity.class);
			startActivity(i);
			Log.i("CLICK", "Button 1 was clicked");
		}
	}

}
