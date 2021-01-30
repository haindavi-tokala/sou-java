/**
 * 
 */
package com.mylearnings.java.core.abstex;

/**
 * @author uppus
 *
 */
public class TotOfMainMarks implements MarksOfStudent {

	@Override
	public String studentName(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int studentClass(int classNo) {
		// TODO Auto-generated method stub
		return classNo;
	}

	@Override
	public char studentSection(char ch) {
		// TODO Auto-generated method stub
		return ch;
	}

	@Override
	public int academics() {
		int total;
		return 0;
	}
	public int total(int maths,int science,int social){
		int total=maths+science+social;
		return total;
		
	}

}
