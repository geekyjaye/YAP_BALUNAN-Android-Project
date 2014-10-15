package com.example.listfragmentpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class FullScreen extends FragmentActivity{
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
		case "Catalyst Movement":
			setContentView(R.layout.catalyst);
			break;
		case "Discipleship":
			setContentView(R.layout.discipleship);
			break;			
		case "Our Cell Groups":
			setContentView(R.layout.cell_groups);
			break;			
		case "Events":
			setContentView(R.layout.events);
			break;		
		case "Gallery":{	
			//Intent intention = new Intent(this.getActivity(), MonthEventsFragment.class);
			//startActivity(intention);
		}
			break;	
		default:
			setContentView(R.layout.testing);
		}
}
}
