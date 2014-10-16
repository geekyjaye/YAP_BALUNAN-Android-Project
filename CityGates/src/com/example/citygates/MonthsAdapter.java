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

public class MonthsAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final ArrayList<MonthsEvents> items;

	public MonthsAdapter(Context context, ArrayList<MonthsEvents> items) {
		super(context, R.layout.months_list);
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
			rowView = inflater.inflate(R.layout.months_list, parent, false);
		}
		TextView title = (TextView) rowView.findViewById(R.id.textView1);

		title.setText(items.get(position).month);

		// Change the icon for Windows and IPhone

		return rowView;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

}
