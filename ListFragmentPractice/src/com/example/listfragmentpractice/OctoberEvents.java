package com.example.listfragmentpractice ;
import java.util.ArrayList;

public class OctoberEvents {

	String eventTitle;
	String eventSchedule;
	String eventLocation;

	public static ArrayList <OctoberEvents> populateItems() {
		ArrayList<OctoberEvents> items = new ArrayList <OctoberEvents>();

		for (int x = 0; x < 4; x++) {
			
			OctoberEvents item = new OctoberEvents();
			
			switch (x) {
			case 0: {
				item.eventTitle = "Back to Church Sunday";
				item.eventLocation = "Calla Hall, JCentre Mall, Mandaue City";
				item.eventSchedule = "10:00 am October 19, 2014";
			}
				break;
			case 1: {
				item.eventTitle = "Post Encounter Graduation";
				item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
				item.eventSchedule = "6:00 pm October 19, 2014.";
			}
				break;
			case 2: {
				item.eventTitle = "Women's Encounter";
				item.eventLocation = "Holy Family Village, Banilad, Cebu City";
				item.eventSchedule = "7:00 pm October 24, 2014";
			}
				break;
			case 3: {
				item.eventTitle = "Men's Encounter";
				item.eventLocation = "Holy Family Village, Banilad, Cebu City";
				item.eventSchedule = "7:00 pm October 25, 2014";
			}
				break;

			}
			
			items.add(item);
		}

		return items;
	}

}
