package com.example.citygates;

import com.example.listfragmentpractice.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SocialMediaAction extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("CHECK", "Im here oFUllScreen ");
		super.onCreate(savedInstanceState);

		Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		String name = extras.getString("Title");
		Log.d("SOCIAL", name);
		switch (name) {
		case "facebook.com/citygateschristiancenter":
			openUrl_InBrowser("http://www.facebook.com/citygateschristiancenter");
			break;
		case "twitter.com/citygatescebu":
			openUrl_InBrowser("http://www.twitter.com/citygatescebu");
			break;
		case "Holy Family Village, Banilad, Cebu City":
			openUrl_InBrowser("http://goo.gl/maps/N7o89");
			break;
		default:
			setContentView(R.layout.testing);
		}
	}

	public void openUrl_InBrowser(String url) {
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));

		checkIfAppExists(i, "Web Browser");
	}

	public void checkIfAppExists(Intent appIntent, String appName) {

		if (appIntent.resolveActivity(getPackageManager()) != null) {

			startActivity(appIntent);
		} else {
			Toast.makeText(SocialMediaAction.this, appName + "does not exist!",
					Toast.LENGTH_LONG).show();
		}

	}
}
