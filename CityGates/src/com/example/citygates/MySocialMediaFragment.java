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

public class MySocialMediaFragment extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = super.onCreateView(inflater, container, savedInstanceState);
		ArrayList<SocialMediaItem> items = SocialMediaItem.populateItems();
		MySocialMediaAdapter adapter = new MySocialMediaAdapter(getActivity(),
				items);
		Log.d("SocialMEDIA", "CallAdpater");
		this.setListAdapter(adapter);
		return v;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		Log.d("Before", "HERE");
		TextView textView = (TextView) this.getListView().getChildAt(position)
				.findViewById(R.id.textView1);
		Log.d("CHECKTEXT", "Text: " + textView.getText());
		Intent intent = new Intent(getActivity().getApplicationContext(),
				SocialMediaAction.class);
		intent.putExtra("Title", textView.getText());
		Log.d("SocialMEDIA", "Call");
		startActivity(intent);
	}

}
