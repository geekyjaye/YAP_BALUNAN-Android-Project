package com.example.citygates;

import java.util.ArrayList;

import com.example.listfragmentpractice.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MonthEventsAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final ArrayList<SelectedMonthEvents> items;

	public MonthEventsAdapter(Context context,
			ArrayList<SelectedMonthEvents> items) {
		super(context, R.layout.month_events_list);
		this.context = context;
		this.items = items;
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView != null) {
			rowView = convertView;
		} else {
			rowView = inflater.inflate(R.layout.month_events_list, parent,
					false);
		}
		TextView title = (TextView) rowView.findViewById(R.id.textView1);
		TextView location = (TextView) rowView.findViewById(R.id.textView2);
		TextView schedule = (TextView) rowView.findViewById(R.id.textView3);
		title.setText(items.get(position).eventTitle);
		location.setText(items.get(position).eventLocation);
		schedule.setText(items.get(position).eventSchedule);

		// Change the icon for Windows and IPhone

		return rowView;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

}
