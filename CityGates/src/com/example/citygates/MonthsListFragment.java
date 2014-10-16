package com.example.citygates;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MonthsListFragment extends ListFragment {
	ArrayList<MonthsEvents> items;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View v = super.onCreateView(inflater, container, savedInstanceState);
		items = MonthsEvents.populateItems();

		MonthsAdapter adapter = new MonthsAdapter(this.getActivity(), items);
		this.setListAdapter(adapter);
		return v;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub

		super.onListItemClick(l, v, position, id);
		MonthsEvents item;
		item = items.get(position);
		MonthEventsListFragment.text = item.month;
		Intent intention = new Intent(this.getActivity(),
				MonthEventsFragment.class);
		intention.putExtra("Month", item.month);
		startActivity(intention);

	}

}
