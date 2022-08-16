package com.stg.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.stg.model.Student;

public class StudentLogic {

	// Function 1     returns boolean
	public boolean searchStudentName(Student student1, String name) {
		boolean temp = false;
		if (student1.getStudentName().equalsIgnoreCase(name)) {
			temp = true;

		} else {
			return false;
		}
		return temp;

	}
//-------------------------------------------------------------------------------------------

	// Function 2     returns integer
	public int checkStudentByClass(Student studentArray[], int checkClassroom) {
		int a = 0;
		for (int j = 0; j < studentArray.length; j++) {
			if (studentArray[j].getStudClass() == checkClassroom) {
				a++;
			}
		}

		return a;
	}
//-------------------------------------------------------------------------------------------
	
	// Function 3      returns array
	public Student[] checkStudentById(Student studentArray[], int checkId) {
		Student[] newArray = new Student[0];
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getStudentId() == checkId) {
				newArray = studentArray;
			} else {
				newArray = null;
			}

		}
		return newArray;

	}
//--------------------------------------------------------------------------------------------

	// Function 4     returns String
	public String checkStudentByName(Student studentArray[], String checkName) {
		String newName = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getStudentName().equalsIgnoreCase(checkName)) {
				newName = checkName;
			}
		}
		if (newName != null) {
			return newName;
		} else {
			return null;
		}
	}	
//---------------------------------------------------------------------------------------------
	
	// Function 5     returns object
	public Student searchStudentByClass(Student student2, int searchClass) {
			Student newObject = null;
			if(student2.getStudClass()> searchClass) {
				newObject = student2;
			} else {
				newObject = null;
			}
			return newObject;
		
	}
//----------------------------------------------------------------------------------------------
	
	// Function 6     returns Integer
		public int searchStudentListByName(List<Student> studentList, String searchName) {
			List<Student> newList = new ArrayList<Student>();
			int count = 0;
			for (Student student : studentList) {
				if(student.getStudentName().equalsIgnoreCase(searchName))
				{
					newList.add(student);
					count =newList.size();
					
				}	
			}
			return count;
		}
			
//------------------------------------------------------------------------------------------------
		
	// Function 7     returns List
		public List<Student> listOfStudents(List<Student> studentList, String searchName2) {
			List<Student> newList = new ArrayList<Student>();
			for (Student student : studentList) {
				if (student.getStudentName().equalsIgnoreCase(searchName2)) {
					newList.add(student);
				}

			}

			return newList;

		}

	}
