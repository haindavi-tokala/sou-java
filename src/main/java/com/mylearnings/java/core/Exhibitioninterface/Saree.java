/**
 * 
 */
package com.mylearnings.java.core.Exhibitioninterface;

/**
 * @author uppus
 * 
 */
public class Saree {
	private String nameOfStallOwner;
	private String mobileNoOfStallOwner;
	private String idProof;
	private int noOfVarieties;
	private int maxPriceOfSaree;
	private int teamSize;

	public Saree() {

	}

	public Saree(String nameOfStallOwner, String mobileNoOfStallOwner,
			String idProof, int noOfVarieties, int maxPriceOfSaree, int teamSize) {
		super();
		this.nameOfStallOwner = nameOfStallOwner;
		this.mobileNoOfStallOwner = mobileNoOfStallOwner;
		this.idProof = idProof;
		this.noOfVarieties = noOfVarieties;
		this.maxPriceOfSaree = maxPriceOfSaree;
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

	public int getMaxPriceOfSaree() {
		return maxPriceOfSaree;
	}

	public void setMaxPriceOfSaree(int maxPriceOfSaree) {
		this.maxPriceOfSaree = maxPriceOfSaree;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Saree [nameOfStallOwner=" + nameOfStallOwner
				+ ", mobileNoOfStallOwner=" + mobileNoOfStallOwner
				+ ", idProof=" + idProof + ", noOfVarieties=" + noOfVarieties
				+ ", maxPriceOfSaree=" + maxPriceOfSaree + ", teamSize="
				+ teamSize + "]";
	}

}
