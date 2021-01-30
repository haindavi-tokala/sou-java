package com.mylearnings.java.core.interface2ex;

public enum DayEnum implements Week {
	SUNDAY(01), MONDAY(02), TUESDAY(03), WEDNESDAY(04), THURSDAY(05), FRIDAY(06), SATURDAY(
			07);

	private int day;

	DayEnum() {

	}

	private DayEnum(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	@Override
	public  int displayDay() {
		DayEnum dayEnum= DayEnum.MONDAY;
		switch (01) {
		case 01:
			System.out.println("First Day of the week");
			break;
		case 02:
			System.out.println("Second Day of the week");
			break;
		case 03:
			System.out.println("Third Day of the week");
			break;
		case 04:
			System.out.println("Fourth Day of the week");
			break;
		case 05:
			System.out.println("Fifth Day of the week");
			break;
		case 06:
			System.out.println("Sixth Day of the week");
			break;
		case 07:
			System.out.println("Seventh Day of the week");
			break;
		default:
			System.out.println("INVALID INPUT");
		
	}
		return 0;
	}

}