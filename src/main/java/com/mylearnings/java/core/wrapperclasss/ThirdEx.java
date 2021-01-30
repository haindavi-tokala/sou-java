package com.mylearnings.java.core.wrapperclasss;

public class ThirdEx {

	public static void main(String[] args) {
		Age age = new Age(10);
		System.out.printf("My younger brother is " + age.intValue()
				+ " years old\n");
		Age age2 = Age.valueOf(20);
		System.out.printf("I am " + age2.intValue() + " years old\n");
		//Age age3 = Age.valueOf("30");
		int age4=Integer.parseInt("30");
		System.out.println("My older sister's age is " + age4);
		boolean age5=Boolean.parseBoolean("true");
		double age6=Double.parseDouble("23.323");
		Long age7=Long.parseLong("234294824");
		byte age8=Byte.parseByte("3");
		System.out.println("Boolean:  "+age5+" //Double: "+age6+" //Long:  "+age7+" //Byte: "+age8);
	}

	public static class Age {

		int age;

		public Age(int age) {
			this.age = age;
		}

		public static Age valueOf(int age) {
			return new Age(age);
		}

		public static Age valueOf(String age) {
			return new Age(Integer.valueOf(age));
		}

		public int intValue() {
			return age;
		}

		public String toString() {
			return Integer.toString(age);
		}

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Age other = (Age) obj;
			if (age != other.age)
				return false;
			return true;
		}
	}

}
