package com.example.listfragmentpractice;

import java.util.ArrayList;

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

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener{
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
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		// TODO Auto-generated method stub
		
		//HighLightItem items = (HighLightItem)this.getListView().getChildAt(position);
		/*
		  TextView textView = (TextView) rowView.findViewById(R.id.textView1 );
		    ImageView img = (ImageView) rowView.findViewById(R.id.imageView1);
			textView.setText(items.get(position).itemName);
		
			img.setImageResource(items.get(position).imageResourceRef);
				*/
		//Log.d("CHECKITEMS", "POS :" + this.getListView().getChildAt(position).findViewById(R.id.textView1). );
		HighLightItem item=items.get(position);
			
		//TextView textView = (TextView)this.getListView().getChildAt(position).findViewById(R.id.textView1);
		//	Log.d("CHECKTEXT", "Text: " + textView.getText());
		Intent intent = new Intent(getActivity().getApplicationContext(), FullScreen.class);
		intent.putExtra("Title", item.itemName);
		Log.d("Before", "HERENEW " + position);
		startActivity(intent);
    	}

/*
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Log.d("CHECKP", "Position: " + position);
		//HighLightItem items = (HighLightItem) getListAdapter().getItem(position);
	//Log.d("CHECKITEMSNEW", "Count: " + this.getListAdapter(). );
		Intent intent = new Intent(getActivity().getApplicationContext(), FullScreen.class);
		startActivity(intent);
	}
*/	
    
		
	}


  