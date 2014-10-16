package com.example.citygates;

import com.example.listfragmentpractice.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MonthEventsFragment extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		Log.d("CHECKNEW", "Im here FUllScreen ");
		setContentView(R.layout.month_events);

		Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		String month = extras.getString("Month");
		if (month != null) {
			TextView nameField = (TextView) findViewById(R.id.textView2);
			nameField.setText(month);

		}
	}

}
