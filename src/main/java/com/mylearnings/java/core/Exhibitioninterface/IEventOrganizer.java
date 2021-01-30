package com.mylearnings.java.core.Exhibitioninterface;

public interface IEventOrganizer {
	public EventOrganizer getStallInfo(Saree saree, Food food,
			Ornaments ornaments, int stallId, String placeOfStall);

	public EventOrganizer getStallInfo(EventOrganizer eventOrganizer);
}
