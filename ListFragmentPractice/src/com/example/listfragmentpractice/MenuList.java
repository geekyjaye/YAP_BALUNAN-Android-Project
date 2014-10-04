package com.example.listfragmentpractice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MenuList extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("CHECK", "Im here oFUllScreen ");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
}
}
