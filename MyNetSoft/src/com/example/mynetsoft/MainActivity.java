package com.example.mynetsoft;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {


	WebView mWebView;

	@SuppressLint("SetJavaScriptEnabled")
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	            
	    mWebView = (WebView) findViewById(R.id.webview);
		// включаем поддержку JavaScript
	    mWebView.getSettings().setJavaScriptEnabled(true);
		// указываем страницу загрузки
	    mWebView.loadUrl("http://md5.jsontest.com/?text=pepyaka"); 
	}

}
