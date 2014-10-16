package com.example.citygates;

import java.util.ArrayList;

import com.example.listfragmentpractice.R;

public class HighLightItem {

	String itemName;
	int imageResourceRef;
	String shortDescription;

	public static ArrayList<HighLightItem> populateItems() {
		ArrayList<HighLightItem> items = new ArrayList<HighLightItem>();

		for (int x = 0; x < 9; x++) {

			HighLightItem item = new HighLightItem();

			switch (x) {
			case 0: {
				item.itemName = "About City Gates";
				item.imageResourceRef = R.drawable.info;
			}
				break;

			case 1: {
				item.itemName = "Meet Our Pastors";
				item.imageResourceRef = R.drawable.connect;
			}
				break;
			case 2: {
				item.itemName = "Sunday Celebration";
				item.imageResourceRef = R.drawable.celebration;
			}
				break;
			case 3: {
				item.itemName = "Our Cell Groups";
				item.imageResourceRef = R.drawable.group;
			}
				break;
			case 4: {
				item.itemName = "Catalyst Movement";
				item.imageResourceRef = R.drawable.catalystlogo;

			}
				break;
			case 5: {
				item.itemName = "Discipleship";
				item.imageResourceRef = R.drawable.discipleship;

			}
				break;
			case 6: {
				item.itemName = "Events";
				item.imageResourceRef = R.drawable.events;
			}
				break;
			case 7: {
				item.itemName = "Gallery";
				item.imageResourceRef = R.drawable.gallery;
			}
				break;
			case 8: {
				item.itemName = "Contact Us";
				item.imageResourceRef = R.drawable.businesscontact;

			}
				break;

			}

			items.add(item);
		}

		return items;
	}

}
