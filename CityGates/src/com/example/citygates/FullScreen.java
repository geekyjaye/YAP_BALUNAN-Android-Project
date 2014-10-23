package com.example.citygates;

import java.util.ArrayList;

import com.example.listfragmentpractice.R;
import com.touchmenotapps.carousel.simple.HorizontalCarouselLayout;
import com.touchmenotapps.carousel.simple.HorizontalCarouselStyle;
import com.touchmenotapps.carousel.simple.HorizontalCarouselLayout.CarouselInterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FullScreen extends FragmentActivity {
	private HorizontalCarouselStyle mStyle;
	private HorizontalCarouselLayout mCarousel;
	private CarouselAdapter mAdapter;
	String[] title = { "Sunday Celebration", "CGCC Leaders", "Catalyst Youth",
			"Cell Group" };
	private ArrayList<Integer> mData = new ArrayList<Integer>(0);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("CHECK", "Im here oFUllScreen ");
		super.onCreate(savedInstanceState);

		Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		String name = extras.getString("Title");
		Log.d("CHECKINTENT", name);
		switch (name) {
		case "About City Gates":
			setContentView(R.layout.about_us);
			break;
		case "Meet Our Pastors":
			startActivity(new Intent(FullScreen.this, MeetOurPastors.class));
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
		case "Gallery": {
			// Intent intention = new Intent(this.getActivity(),
			// MonthEventsFragment.class);
			// startActivity(intention);
			setContentView(R.layout.gallery);
			mData.add(R.drawable.praiseandworship);
			mData.add(R.drawable.cgccleaders);
			mData.add(R.drawable.catalystyouth);
			mData.add(R.drawable.cellgroupic);
			mAdapter = new CarouselAdapter(this);
			mAdapter.setData(mData);
			mCarousel = (HorizontalCarouselLayout) findViewById(R.id.carousel_layout);
			mStyle = new HorizontalCarouselStyle(this,
					HorizontalCarouselStyle.NO_STYLE);
			mCarousel.setStyle(mStyle);
			mCarousel.setAdapter(mAdapter);

			mCarousel.setOnCarouselViewChangedListener(new CarouselInterface() {
				@Override
				public void onItemChangedListener(View v, int position) {
					Toast.makeText(FullScreen.this, title[position],
							Toast.LENGTH_SHORT).show();

				}
			});
		}
			break;
		}
	}
}
