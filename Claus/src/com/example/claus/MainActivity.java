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
		Log.i("OnClick", "Load classes");
		if (btn.equals(findViewById(R.id.button1))) {
			Log.i("IF", "Load if");
			Intent i = new Intent(this, DisplayMessageActivity.class);
			startActivity(i);
			Log.i("CLICK", "Button 1 was clicked");
		}
		
	}

}
