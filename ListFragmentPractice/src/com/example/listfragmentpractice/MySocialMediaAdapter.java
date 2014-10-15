package com.example.listfragmentpractice;
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MySocialMediaAdapter extends ArrayAdapter<String>{
	private final Context context;
	private final ArrayList<SocialMediaItem> items;
	public MySocialMediaAdapter(Context context, ArrayList<SocialMediaItem> items) {
		super(context, R.layout.mysocialmediafragment);
		this.context=context;
		this.items=items;
		// TODO Auto-generated constructor stub
	}
@Override
public View getView(int position, View convertView, ViewGroup parent){
	View rowView;
	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	if(convertView!=null){
		rowView=convertView;
	}else{
		rowView = inflater.inflate(R.layout.mysocialmediafragment, parent, false);
	}
    TextView textView = (TextView) rowView.findViewById(R.id.textView1 );
    ImageView img = (ImageView) rowView.findViewById(R.id.imageView1);
	textView.setText(items.get(position).socialMedia);
	img.setImageResource(items.get(position).imageResourceRef);
	//Change the icon for Windows and IPhone



	return rowView;
}
@Override
public int getCount() {
	// TODO Auto-generated method stub
	return items.size();
}
	

}

