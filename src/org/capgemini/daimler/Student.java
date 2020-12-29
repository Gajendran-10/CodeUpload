package org.capgemini.daimler;


public class Student {
	
	public void studentid(int n) {
		System.out.println("Student ID is :"+n);
	}
	public void studentname(String nam) {
		System.out.println("Student Name: "+nam);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student();
s.studentid(86430);
s.studentname("ABCDE");
		
	}

}
