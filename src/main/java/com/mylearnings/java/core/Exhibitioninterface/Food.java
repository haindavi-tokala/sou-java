/**
 * 
 */
package com.mylearnings.java.core.Exhibitioninterface;

/**
 * @author uppus
 * 
 */
public class Food {
	private String nameOfStallOwner;
	private String mobileNoOfStallOwner;
	private String idProof;
	private int noOfVarieties;
	private int minPrice;
	private int maxPrice;
	private int teamSize;

	public Food() {

	}

	public Food(String nameOfStallOwner, String mobileNoOfStallOwner,
			String idProof, int noOfVarieties, int minPrice, int maxPrice,
			int teamSize) {
		super();
		this.nameOfStallOwner = nameOfStallOwner;
		this.mobileNoOfStallOwner = mobileNoOfStallOwner;
		this.idProof = idProof;
		this.noOfVarieties = noOfVarieties;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.teamSize = teamSize;
	}

	public String getNameOfStallOwner() {
		return nameOfStallOwner;
	}

	public void setNameOfStallOwner(String nameOfStallOwner) {
		this.nameOfStallOwner = nameOfStallOwner;
	}

	public String getMobileNoOfStallOwner() {
		return mobileNoOfStallOwner;
	}

	public void setMobileNoOfStallOwner(String mobileNoOfStallOwner) {
		this.mobileNoOfStallOwner = mobileNoOfStallOwner;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public int getNoOfVarieties() {
		return noOfVarieties;
	}

	public void setNoOfVarieties(int noOfVarieties) {
		this.noOfVarieties = noOfVarieties;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Food [nameOfStallOwner=" + nameOfStallOwner
				+ ", mobileNoOfStallOwner=" + mobileNoOfStallOwner
				+ ", idProof=" + idProof + ", noOfVarieties=" + noOfVarieties
				+ ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", teamSize=" + teamSize + "]";
	}

}
