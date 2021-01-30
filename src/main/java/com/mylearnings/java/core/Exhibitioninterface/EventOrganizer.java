/**
 * 
 */
package com.mylearnings.java.core.Exhibitioninterface;

/**
 * @author uppus
 * 
 */
public class EventOrganizer {
	private Saree saree;
	private Food food;
	private Ornaments ornaments;
	private int stallId;
	private String placeOfStall;
	private StallSize stallSize;

	public EventOrganizer() {

	}

	public EventOrganizer(Saree saree, Food food, Ornaments ornaments,
			int stallId, String placeOfStall, StallSize stallSize) {
		super();
		this.saree = saree;
		this.food = food;
		this.ornaments = ornaments;
		this.stallId = stallId;
		this.placeOfStall = placeOfStall;
		this.stallSize = stallSize;
	}

	public Saree getSaree() {
		return saree;
	}

	public void setSaree(Saree saree) {
		this.saree = saree;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Ornaments getOrnaments() {
		return ornaments;
	}

	public void setOrnaments(Ornaments ornaments) {
		this.ornaments = ornaments;
	}

	public int getStallId() {
		return stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public String getPlaceOfStall() {
		return placeOfStall;
	}

	public void setPlaceOfStall(String placeOfStall) {
		this.placeOfStall = placeOfStall;
	}

	public StallSize getStallSize() {
		return stallSize;
	}

	public void setStallSize(StallSize stallSize) {
		this.stallSize = stallSize;
	}

	public String toString1() {
		return "stallId=" + stallId + ", placeOfStall=" + placeOfStall
				+ ", stallSize=" + stallSize + " EventOrganizer [saree="
				+ saree + "]";
	}

	public String toString2() {
		return "stallId=" + stallId + ", placeOfStall=" + placeOfStall
				+ ", stallSize=" + stallSize + " EventOrganizer [food=" + food
				+ "]";
	}

	public String toString3() {
		return "stallId=" + stallId + ", placeOfStall=" + placeOfStall
				+ ", stallSize=" + stallSize + " EventOrganizer [ornaments="
				+ ornaments + "]";
	}
}
