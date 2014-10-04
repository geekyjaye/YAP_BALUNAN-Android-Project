package com.example.listfragmentpractice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class FullScreen extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("CHECK", "Im here oFUllScreen ");
		super.onCreate(savedInstanceState);
		
		Bundle extras = getIntent().getExtras();
		if(extras == null){return;}
		String name = extras.getString("Title");
		Log.d("CHECKINTENT", name);
		switch(name){
		case "About City Gates":
			setContentView(R.layout.about_us);
			break;
		case "Meet Our Pastors":
			setContentView(R.layout.meet_our_pastors);
			break;	
		case "Contact Us":
			setContentView(R.layout.contact_us);
			break;	
		case "Sunday Celebration":
			setContentView(R.layout.sunday_celebration);
			break;
		default:
			setContentView(R.layout.testing);
		}
}
}
