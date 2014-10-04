package com.example.listfragmentpractice;

import java.util.ArrayList;

public class HighLightItem {

	String itemName;
	int imageResourceRef;
	String shortDescription;

	public static ArrayList<HighLightItem> populateItems() {
		ArrayList<HighLightItem> items = new ArrayList<HighLightItem>();

		for (int x = 0; x < 6; x++) {
			
			HighLightItem item = new HighLightItem();
			
			switch (x) {
			case 0: {
				item.itemName = "About City Gates";
				item.imageResourceRef = R.drawable.info ;
			}
				break;
			
			case 1: {
				item.itemName = "Meet Our Pastors";
				item.imageResourceRef = R.drawable.connect ;
			}
				break;
				
			case 2: {
				item.itemName = "Sunday Celebration";
				item.imageResourceRef = R.drawable.discipleship ;

			}
				break;
				
			case 3: {
				item.itemName = "Podcasts";
				item.imageResourceRef = R.drawable.podcast ;
			}
				break;
				
			case 4: {
				item.itemName = "Events";
				item.imageResourceRef = R.drawable.events;
			}
				break;
				
			case 5: {
				item.itemName = "Contact Us";
				item.imageResourceRef = R.drawable.businesscontact ;

			}
				break;

			}
			
			items.add(item);
		}

		return items;
	}

}
