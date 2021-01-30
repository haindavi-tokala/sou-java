package com.mylearnings.java.core.enumex;

 enum SizeEnum {
	
		SMALL("32-33"), MEDIUM("36-38"), LARGE("40-42"), EXTRALARGE("44-46");


	private String size;

	 private SizeEnum(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

	
	
	
}
