package com.example.claus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class DisplayMessageActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
	}


	/** Called when the user clicks the Send button */
	public void onClick(View v) {
		if (v.equals(this.findViewById(R.id.button1))) {
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);
			Log.i("CLICK", "Button 2 was clicked");
			}
	}
}