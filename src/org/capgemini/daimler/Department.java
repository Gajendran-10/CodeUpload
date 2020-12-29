package org.capgemini.daimler;

public class Department {
	public void Deptid(int i) {
		System.out.println("Department ID: "+i);
	}
	public void Deptname(String dept) {
		System.out.println("Department Name: "+dept);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.studentid(86430);
		s.studentname("ABCDE");
		Department d=new Department();
		d.Deptid(1);
		d.Deptname("CSE");

	}

}
