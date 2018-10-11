package ie.gmit.studentmanager;

import java.util*;

public class StudentManager {
	//instance variables 
	private Student[] students = null;
	
	//array values
	private static final int INITIAL_CAPACITY = 10;
	
	//Constructor
	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
	}
	
	//Methods	
	public boolean addStudent(Student student) {
		return false;
	}
	
	public boolean deleteStudent(String studentId) {
		return false;
	}
	
	public Student[] getStudentById(String studentId) {
		return null;
	}
	
	public int findTotalStudents(String studentId) {
		return -1;
	}
	
	
	

}
