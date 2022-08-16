package com.stg.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.stg.model.Student;
import com.stg.service.StudentLogic;

public class ProjectMain {

	public static void main(String[] args) {

		Student student1 = new Student("Suhaina", 1, 12);
		Student student2 = new Student("Azeem", 2, 34);
		Student student3 = new Student("Yash", 3, 23);

		// Creating an array for students 1 to 3 
		// Array starts from function 2
		Student[] studentArray = new Student[3];
		studentArray[0] = student1;
		studentArray[1] = student2;
		studentArray[2] = student3;

		StudentLogic studentLogic = new StudentLogic();
		
		// To print array
		System.out.println("STUDENT ARRAY");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("Student name is: "  + studentArray[i].getStudentName());
			System.out.println("Student Id is: "    + studentArray[i].getStudentId());
			System.out.println("Student class is: " + studentArray[i].getStudClass());
			System.out.println("-----------------");
		}

		System.out.println("-----------------");
		
		//------------------------------------------------------------------------------------------------------------

		// Creating a list for students 4 to 6
	    Student student4 = new Student("Somesh", 4, 45);
		Student student5 = new Student("Bose", 5, 67);
		Student student6 = new Student("Harsha", 6, 56);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student4);
		
		// To print list
		System.out.println("STUDENT LIST");
		for (Student studentPrint : studentList) {
		    System.out.println("Student name is: "  + studentPrint.getStudentName());
			System.out.println("Student ID is: "    + studentPrint.getStudentId());
			System.out.println("Student class is: " + studentPrint.getStudClass());
			System.out.println("-----------------");
				}
		System.out.println("-----------------");
				
//---------------------------------------------------------------------------------------------------------
		
		// Function 1
		System.out.println("1) Checking if a student is present or not");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a student name: ");
		String name = scan.next();
		
		boolean result1 = studentLogic.searchStudentName(student1, name);
		if (result1 == true) {
			System.out.println("Student is present" + "\n" + name);
		} else {
			System.out.println("Student is absent search for another" + "\n" + name);
		}
		System.out.println("-----------------");
		
//----------------------------------------------------------------------------------------------------------
		
		// Function 2
		System.out.println("2) Checking if class is present or not");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a class number: ");
		int newClassUserValue = scan1.nextInt();
		
		int result2 = studentLogic.checkStudentByClass(studentArray, newClassUserValue);
		if (result2 == 1) {
			System.out.println("Student class is " + newClassUserValue);
			System.out.println("Student classes are: ");
			for (int i = 0; i < studentArray.length; i++) {
				System.out.println(studentArray[i].getStudClass());
			}
		} else {
			System.out.println("NO such Class");
		}
		System.out.println("-----------------");

//----------------------------------------------------------------------------------------------------------
		
		// Function 3 without scanner
		System.out.println("3) Checking student IDs");
		Student[] dummyArray = studentLogic.checkStudentById(studentArray, 3);
		
		if (dummyArray != null) {
			System.out.println("ID number is Correct");
			System.out.println("Student id is: ");
			for (int i = 0; i < dummyArray.length; i++) {
				System.out.println(dummyArray[i].getStudentId());
			}
		} else {
			System.out.println("ID number is Incorrect");
		}

		System.out.println("-----------------");
		
//-----------------------------------------------------------------------------------------------------------

		// Function 4    
		System.out.println("4) Checking student name ");
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Give a student name: ");
		String newStudentUserValue = scan2.next();
		
		String result3 = studentLogic.checkStudentByName(studentArray, newStudentUserValue);
		if (result3 != null) {
			System.out.println("Student name is correct: " + newStudentUserValue);
		} else {
			System.out.println("Student name is incorrect! Give another name");
		}

		System.out.println("-----------------");
		
//-----------------------------------------------------------------------------------------------------------

		// Function 5 without scanner
		System.out.println("5) Searches student class number if greater than given class number");
		Student studentObject = studentLogic.searchStudentByClass(student2, 22);
		if (studentObject != null) {
			System.out.println("Class is right");
			System.out.println("-----------------");
	    // prints the objects
			System.out.println(" Student name : " + studentObject.getStudentName());
			System.out.println(" Student Id   : " + studentObject.getStudentId());
			System.out.println(" Student class: " + studentObject.getStudClass());
			
		} else {
			System.out.println("Class is not right");
		}
		System.out.println("-----------------****----------------");
		

//-------------------------------------------------------------------------------------------------------------
		
		// Function 6
		System.out.println("6) Searches student name from list and gives count");
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Enter the name to be searched: ");
		String searchNameUserVal = scan4.next();

		int result4 = studentLogic.searchStudentListByName(studentList, searchNameUserVal);
		if (result4 != 0) {
			System.out.println("The students are: " + result4);
		}

		else {
			System.out.println("Invalid student name");
		}
		System.out.println("----------------");

//-------------------------------------------------------------------------------------------------------------

       // Function 7
        System.out.println("7) To give list");
    	Scanner scan5 = new Scanner(System.in);
		System.out.println("Enter the name to be searched: ");
		String searchNameInList = scan5.next();
		
		List<Student> tempList = studentLogic.listOfStudents(studentList, searchNameInList);
		if(tempList.size() > 0) {
			for (Student student : tempList) {
				System.out.println("Student is: " + searchNameInList);
				System.out.println("Details of student: " + "\n" + "----------");
				System.out.println(student.getStudentName());
				System.out.println(student.getStudentId());
				System.out.println(student.getStudClass());
			}
			
		}
		
//-------------------------------------------------------------------------------------------------------------
        

	}
}
