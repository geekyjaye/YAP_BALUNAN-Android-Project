package com.example.citygates;

import java.util.ArrayList;

import com.example.listfragmentpractice.R;

import android.app.Activity;
import android.content.Context;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyListFragment extends ListFragment implements
		AdapterView.OnItemClickListener {
	ArrayList<HighLightItem> items;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.my_list_fragment, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		items = HighLightItem.populateItems();
		MyAdapter adapter = new MyAdapter(getActivity(), items);
		this.setListAdapter(adapter);
		getListView().setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		HighLightItem item = items.get(position);
		Intent intent = new Intent(getActivity().getApplicationContext(),
				FullScreen.class);
		intent.putExtra("Title", item.itemName);
		Log.d("Before", "HERENEW " + position);
		startActivity(intent);
	}


}
