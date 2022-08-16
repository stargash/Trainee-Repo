package com.stg.model;

public class Student {
	private String studentName;
	private int studentId;
	private int studClass;

	public Student() {
		super();
	}

	public Student(String studentName, int studentId, int studClass) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studClass = studClass;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudClass() {
		return studClass;
	}

	public void setStudClass(int studClass) {
		this.studClass = studClass;
	}

}