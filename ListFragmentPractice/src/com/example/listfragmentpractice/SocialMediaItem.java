package com.example.listfragmentpractice;

import java.util.ArrayList;

public class SocialMediaItem {

	
	int imageResourceRef;
	String socialMedia;

	public static ArrayList<SocialMediaItem> populateItems() {
		ArrayList<SocialMediaItem> items = new ArrayList<SocialMediaItem>();

		for (int x = 0; x < 4; x++) {
			
			SocialMediaItem item = new SocialMediaItem();
			
			switch (x) {
			case 0: {
				item.socialMedia = "Facebook";
				item.imageResourceRef = R.drawable.facebook;
			}
				break;
			
			case 1: {
				item.socialMedia = "Twitter";
				item.imageResourceRef = R.drawable.twitter ;
			}
				break;

			
			case 2: {
				item.socialMedia = "Email";
				item.imageResourceRef = R.drawable.mail ;
			}
				break;
				
			case 3: {
				item.socialMedia = "Address";
				item.imageResourceRef = R.drawable.home ;
			}
				break;
				
						}
			
			items.add(item);
		}

		return items;
	}

}
