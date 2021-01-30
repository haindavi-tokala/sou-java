/**
 * 
 */
package com.mylearnings.java.core.enumex;

/**
 * @author uppus
 * 
 */
public class SizeEnumimpl {
	public static void main(String[] args) {

		//SizeEnum[] sizes = SizeEnum.values();
		//for (SizeEnum size : sizes) {
			switch ("32-33") {
			case "32-33":
				System.out.println("I ordered a small size Dress");
				break;
			case "36-38":
				System.out.println("I ordered a medium size Dress");
				break;

			default:
				System.out.println("I don't know which one to order");
				break;
			}
			// System.out.println("First Size :"+size.name()+" value of the size is :"+size.getSize());

		}

	}


