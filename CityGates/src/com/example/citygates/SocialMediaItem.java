package com.example.citygates;

import java.util.ArrayList;

import com.example.listfragmentpractice.R;

public class SocialMediaItem {

	int imageResourceRef;
	String socialMedia;

	public static ArrayList<SocialMediaItem> populateItems() {
		ArrayList<SocialMediaItem> items = new ArrayList<SocialMediaItem>();

		for (int x = 0; x < 4; x++) {

			SocialMediaItem item = new SocialMediaItem();

			switch (x) {
			case 0: {
				item.socialMedia = "facebook.com/citygateschristiancenter";
				item.imageResourceRef = R.drawable.facebook;
			}
				break;

			case 1: {
				item.socialMedia = "twitter.com/citygatescebu";
				item.imageResourceRef = R.drawable.twitter;
			}
				break;

			case 2: {
				item.socialMedia = "09227305043";
				item.imageResourceRef = R.drawable.phone;
			}
				break;

			case 3: {
				item.socialMedia = "Holy Family Village, Banilad, Cebu City";
				item.imageResourceRef = R.drawable.address;
			}
				break;

			}

			items.add(item);
		}

		return items;
	}

}
