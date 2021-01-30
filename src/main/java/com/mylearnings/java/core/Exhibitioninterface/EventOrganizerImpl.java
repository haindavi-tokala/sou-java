/**
 * 
 */
package com.mylearnings.java.core.Exhibitioninterface;

/**
 * @author uppus
 * 
 */
public class EventOrganizerImpl implements IEventOrganizer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mylearnings.java.core.Exhibitioninterface.IEventOrganizer#getStallInfo
	 * (com.mylearnings.java.core.Exhibitioninterface.Saree,
	 * com.mylearnings.java.core.Exhibitioninterface.Food,
	 * com.mylearnings.java.core.Exhibitioninterface.Ornaments, int,
	 * java.lang.String)
	 */
	@Override
	public EventOrganizer getStallInfo(Saree saree, Food food,
			Ornaments ornaments, int stallId, String placeOfStall) {
		EventOrganizer eventOrganizer = new EventOrganizer();
		eventOrganizer.setSaree(saree);
		eventOrganizer.setFood(food);
		eventOrganizer.setOrnaments(ornaments);
		return eventOrganizer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mylearnings.java.core.Exhibitioninterface.IEventOrganizer#getStallInfo
	 * ()
	 */
	@Override
	public EventOrganizer getStallInfo(EventOrganizer eventOrganizer) {
		return eventOrganizer;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventOrganizerImpl eventOrganizerImpl = new EventOrganizerImpl();
		EventOrganizer eventOrganizer = new EventOrganizer();
		eventOrganizer.setStallId(23456);
		eventOrganizer.setStallSize(StallSize.DOUBLE);
		eventOrganizer.setPlaceOfStall("Vijayawada");
		Saree saree = new Saree("Madhavi", "9246487751", "1537ABG38", 5, 8000,
				2);
		eventOrganizer.setSaree(saree);
		System.out.println(eventOrganizerImpl.getStallInfo(eventOrganizer)
				.toString1());
		eventOrganizer.setStallId(12456);
		eventOrganizer.setStallSize(StallSize.SINGLE);
		eventOrganizer.setPlaceOfStall("Hyderabad");
		Food food = new Food("Bharathi", "743806539", "ANY470K324", 3, 40, 100,
				5);
		eventOrganizer.setFood(food);
		System.out.println(eventOrganizerImpl.getStallInfo(eventOrganizer)
				.toString2());
		eventOrganizer.setStallId(12356);
		eventOrganizer.setStallSize(StallSize.SHARING);
		eventOrganizer.setPlaceOfStall("Vizag");
		Ornaments ornaments = new Ornaments("Soumya", "9243804847",
				"VKSN4289U", 3, 6, 800, 5000, 3);
		eventOrganizer.setOrnaments(ornaments);
		System.out.println(eventOrganizerImpl.getStallInfo(eventOrganizer)
				.toString3());

	}

}
