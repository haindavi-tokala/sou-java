/**
 * 
 */
package com.mylearnings.java.core.interface2ex;

/**
 * @author uppus
 *
 */
public class Features implements Vehical {
private String feature1;
private String feature2;
private String feature3;
private String feature4;

	public String getFeature1() {
	return feature1;
}

public void setFeature1(String feature1) {
	this.feature1 = feature1;
}

public String getFeature2() {
	return feature2;
}

public void setFeature2(String feature2) {
	this.feature2 = feature2;
}

public String getFeature3() {
	return feature3;
}

public void setFeature3(String feature3) {
	this.feature3 = feature3;
}

public String getFeature4() {
	return feature4;
}

public void setFeature4(String feature4) {
	this.feature4 = feature4;
}

	public Features(String feature1, String feature2, String feature3,
		String feature4) {
	super();
	this.feature1 = feature1;
	this.feature2 = feature2;
	this.feature3 = feature3;
	this.feature4 = feature4;
}

	/* (non-Javadoc)
	 * @see com.mylearnings.java.core.interface2ex.Vehical#engine(java.lang.String)
	 */
	@Override
	public String engine(String typeOfEngine) {
		return typeOfEngine;
	}

	@Override
	public String toString() {
		return "Features [feature1=" + feature1 + ", feature2=" + feature2
				+ ", feature3=" + feature3 + ", feature4=" + feature4 + "]";
	}
	

}
