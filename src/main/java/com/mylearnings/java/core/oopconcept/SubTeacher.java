/**
 * 
 */
package com.mylearnings.java.core.oopconcept;

/**
 * @author uppus
 * 
 */
public class SubTeacher extends Teacher {
	private String subject;
	private String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTeacher subTeacher = new SubTeacher();
		subTeacher.setTeacherName("RAMA");
		subTeacher.setCollegeName("rrce");
		subTeacher.setDesignation("Asst.Prof");
		subTeacher.setSalary(56000);
		subTeacher.setSubject("JAVA");
		System.out.println("Teacher :" + subTeacher.getTeacherName());
		System.out.println(" Subject :" + subTeacher.getSubject());
		System.out.println(" CollegeName :" + subTeacher.getCollegeName());
		System.out.println(" Designation :" + subTeacher.getDesignation());
		System.out.println(" Salary :" + subTeacher.getSalary());

	}

}
