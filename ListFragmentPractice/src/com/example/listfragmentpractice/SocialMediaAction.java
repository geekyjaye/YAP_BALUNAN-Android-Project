package com.example.listfragmentpractice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SocialMediaAction extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("CHECK", "Im here oFUllScreen ");
		super.onCreate(savedInstanceState);
		
		Bundle extras = getIntent().getExtras();
		if(extras == null){return;}
		String name = extras.getString("Title");
		Log.d("CHECKINTENT", name);
		switch(name){
		case "Facebook":
			openUrl_InBrowser("http://www.facebook.com/citygateschristiancenter");
			break;
		case "Twitter":
			openUrl_InBrowser("http://www.facebook.com/citygatescebu");
			break;	
		case "Email":
			setContentView(R.layout.contact_us);
			break;	
		case "Address":
			openUrl_InBrowser("http://goog.gl/maps/N7089");
			break;
		default:
			setContentView(R.layout.testing);
		}
}
	public void openUrl_InBrowser(String url){
		Intent i = new Intent (Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		
		//checkIfAppExists(i,"Web Browser");
	}
	/*public void checkIfAppExists(Intent appIntent,String appName){
		
		if (appIntent.resolveActivity(context.getPackageManager())!=null){
			startActivity(appIntent);
		}else{
			Toast.makeText(context, appName + "does not exist!", Toast.LENGTH_LONG).show();
		}*/
	}

