package com.example.citygates;

import java.util.ArrayList;

public class MonthsEvents {

	String month;

	public static ArrayList<MonthsEvents> populateItems() {
		ArrayList<MonthsEvents> items = new ArrayList<MonthsEvents>();

		for (int x = 0; x < 12; x++) {

			MonthsEvents item = new MonthsEvents();

			switch (x) {
			case 0: {
				item.month = "January";
			}
				break;
			case 1: {
				item.month = "February";
			}
				break;
			case 2: {
				item.month = "March";
			}
				break;
			case 3: {
				item.month = "April";
			}
				break;
			case 4: {
				item.month = "May";
			}
				break;
			case 5: {
				item.month = "June";
			}
				break;
			case 6: {
				item.month = "July";
			}
				break;
			case 7: {
				item.month = "August";
			}
				break;
			case 8: {
				item.month = "September";
			}
				break;
			case 9: {
				item.month = "October";
			}
				break;
			case 10: {
				item.month = "November";
			}
				break;
			case 11: {
				item.month = "December";
			}
				break;
			}

			items.add(item);
		}

		return items;
	}

}
