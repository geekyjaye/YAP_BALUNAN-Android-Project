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

public class MySocialMediaFragment extends ListFragment implements AdapterView.OnItemClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = super.onCreateView(inflater, container, savedInstanceState);
        ArrayList<SocialMediaItem> items = SocialMediaItem.populateItems();       
        MySocialMediaAdapter adapter = new MySocialMediaAdapter(getActivity(), items);
        this.setListAdapter(adapter);
        //getListView().setOnItemClickListener(this);
        return v;
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
		Log.d("Before", "HERE");	
		TextView textView = (TextView)this.getListView().getChildAt(position).findViewById(R.id.textView1);
			Log.d("CHECKTEXT", "Text: " + textView.getText());
		Intent intent = new Intent(getActivity().getApplicationContext(), SocialMediaAction.class);
		intent.putExtra("Title", textView.getText());
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


  