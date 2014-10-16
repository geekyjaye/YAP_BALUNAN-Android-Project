package com.example.citygates;

import java.util.ArrayList;

public class SelectedMonthEvents {
	static String selectedMonth = "default";
	String eventTitle;
	String eventSchedule;
	String eventLocation;

	public static ArrayList<SelectedMonthEvents> populateItems() {
		ArrayList<SelectedMonthEvents> items = new ArrayList<SelectedMonthEvents>();
		switch (selectedMonth) {
		/* start */case "January": {
			for (int x = 0; x < 2; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "New Year";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "10:00 am January 5, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Pre-Encounter Opening";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm January 19, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "February": {
			for (int x = 0; x < 2; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "True Love Waits";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm February 15, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Pre-Encounter Opening";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm February 19, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "March": {
			for (int x = 0; x < 3; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "Sem Ender";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "6:30 pm March 15, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Encounter Opening";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "7:00 pm March 20, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "Night of Fire";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "7:00 pm March 25, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "April": {
			for (int x = 0; x < 3; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "Cluster Bonding";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "10:00 am April 15, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Youth Night";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "6:30 pm April 20, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "Night of Fire";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "7:00 pm April 25, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "May": {
			for (int x = 0; x < 2; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "G12 Conference";
					item.eventLocation = "Mariner's Court, Pier 1, Cebu City";
					item.eventSchedule = "7:00 pm May 18, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Youth Night";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "6:30 pm April 20, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "June": {
			for (int x = 0; x < 4; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "Back to Church Sunday";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "10:00 am June 1, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Go for Excellence";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "6:30 pm June 15, 2014.";
				}
				case 2: {
					item.eventTitle = "Night of Fire";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "7:00 pm June 20, 2014.";
				}
					break;
				case 3: {
					item.eventTitle = "Encounter Mentors' Training";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "7:00 pm June 28, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "July": {
			for (int x = 0; x < 3; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "School of Leaders 1 Opening";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm July 10, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Post-Encounter Graduation";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "7:30 pm July 15, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "Pre-Encounter Closing";
					item.eventLocation = "Calla Hall, JCentre Mall, Mandaue City";
					item.eventSchedule = "10:00 pm July 25, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "August": {
			for (int x = 0; x < 3; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "School of Leaders 2 Opening";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm August 12, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "School of Leaders 1 Graduation";
					item.eventLocation = "Calla Hall, JCentre Mall, Mandaue City";
					item.eventSchedule = "10:00 am Auust 20, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "Encounter Training";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "7:00 pm August 25, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "September": {
			for (int x = 0; x < 3; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "144 Meeting";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "7:00 pm September 8, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "School of Leaders 1 Graduation";
					item.eventLocation = "Calla Hall, JCentre Mall, Mandaue City";
					item.eventSchedule = "10:00 am September 15, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "School of Leaders 3 Opening";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm September 20, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		/* start */case "October": {
			for (int x = 0; x < 4; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

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

		}
			/* end */break;
		case "November": {
			for (int x = 0; x < 3; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "Ignite";
					item.eventLocation = "Holy Family Village, Banilad, Cebu City";
					item.eventSchedule = "1:00 pm November 9, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Paint the Campus Red";
					item.eventLocation = "Mariner's Court, Pier 1, Cebu City";
					item.eventSchedule = "7:00 pm Novmber 14, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "G12 Conference";
					item.eventLocation = "Mariner's Court, Pier 1, Cebu City";
					item.eventSchedule = "7:00 pm November 19, 2014";
				}
					break;

				}

				items.add(item);
			}

		}
			break;
		/* start */case "December": {
			for (int x = 0; x < 4; x++) {

				SelectedMonthEvents item = new SelectedMonthEvents();

				switch (x) {
				case 0: {
					item.eventTitle = "Tree Planting";
					item.eventLocation = "Pit-os, Talamban, Cebu City";
					item.eventSchedule = "6:00 am December 5, 2014";
				}
					break;
				case 1: {
					item.eventTitle = "Night of Fire";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "7:00 pm December 15, 2014.";
				}
					break;
				case 2: {
					item.eventTitle = "Christmas Party";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "6:00 pm December 20, 2014.";
				}
					break;
				case 3: {
					item.eventTitle = "Christmas Party";
					item.eventLocation = "Orchard Hotel, A.S. Fortuna St., Mandaue City";
					item.eventSchedule = "6:00 pm December 20, 2014.";
				}
					break;

				}

				items.add(item);
			}

		}
			/* end */break;
		}
		return items;
	}
}
