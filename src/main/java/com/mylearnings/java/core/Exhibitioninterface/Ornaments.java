/**
 * 
 */
package com.mylearnings.java.core.Exhibitioninterface;

/**
 * @author uppus
 * 
 */
public class Ornaments {
	private String nameOfStallOwner;
	private String mobileNoOfStallOwner;
	private String idProof;
	private int noOfornamentMaterial;
	private int noOfornamentVarieties;
	private int minPrice;
	private int maxPrice;
	private int teamSize;

	public Ornaments() {

	}

	public Ornaments(String nameOfStallOwner, String mobileNoOfStallOwner,
			String idProof, int noOfornamentMaterial,
			int noOfornamentVarieties, int minPrice, int maxPrice, int teamSize) {
		super();
		this.nameOfStallOwner = nameOfStallOwner;
		this.mobileNoOfStallOwner = mobileNoOfStallOwner;
		this.idProof = idProof;
		this.noOfornamentMaterial = noOfornamentMaterial;
		this.noOfornamentVarieties = noOfornamentVarieties;
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

	public int getNoOfornamentMaterial() {
		return noOfornamentMaterial;
	}

	public void setNoOfornamentMaterial(int noOfornamentMaterial) {
		this.noOfornamentMaterial = noOfornamentMaterial;
	}

	public int getNoOfornamentVarieties() {
		return noOfornamentVarieties;
	}

	public void setNoOfornamentVarieties(int noOfornamentVarieties) {
		this.noOfornamentVarieties = noOfornamentVarieties;
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
		return "Ornaments [nameOfStallOwner=" + nameOfStallOwner
				+ ", mobileNoOfStallOwner=" + mobileNoOfStallOwner
				+ ", idProof=" + idProof + ", noOfornamentMaterial="
				+ noOfornamentMaterial + ", noOfornamentVarieties="
				+ noOfornamentVarieties + ", minPrice=" + minPrice
				+ ", maxPrice=" + maxPrice + ", teamSize=" + teamSize + "]";
	}

}
