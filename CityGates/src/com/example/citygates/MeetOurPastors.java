package com.example.citygates;



import com.example.listfragmentpractice.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.net.Uri;

public class MeetOurPastors extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meet_our_pastors);

	}
	
public void sendEmailtoPastorJustin(View v) {
	Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
            "mailto","justin.siao@gmail.com", null));
	emailIntent.putExtra(Intent.EXTRA_SUBJECT, "EXTRA_SUBJECT");
	startActivity(Intent.createChooser(emailIntent, "Send email ..."));
}
public void callPastorJustin(View v) {   
    Intent callIntent = new Intent(Intent.ACTION_DIAL);          
    callIntent.setData(Uri.parse("tel:09227315043"));          
    startActivity(callIntent);  
}
public void sendEmailtoPastorJuby(View v) {
	Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
            "mailto","juby.siao@gmail.com", null));
	emailIntent.putExtra(Intent.EXTRA_SUBJECT, "EXTRA_SUBJECT");
	startActivity(Intent.createChooser(emailIntent, "Send email ..."));
}
public void callPastorJuby(View v) {   
    Intent callIntent = new Intent(Intent.ACTION_DIAL);          
    callIntent.setData(Uri.parse("tel:09227315043"));          
    startActivity(callIntent);  
}

}
