package ie.gmit.studentmanager;

import java.util.*; //date object

public class Student {
	
	//instance variables 
	private String firstName;
	private String lastName;
	private int age;
	private Date dob;
	private Address address;
	private Course course;
	
	
	//Constructor 
	public Student(String firstName, String lastName, int age, Date dob, Address address, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.address = address;
		this.course = course;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}
