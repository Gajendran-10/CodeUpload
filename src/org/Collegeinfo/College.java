package org.Collegeinfo;
import org.capgemini.daimler.*;

public class College {
	public void Collcod(int i) {
		System.out.println("College code: "+i);
	}
	public void Collegename(String dept) {
		System.out.println("College Name: "+dept);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College c=new College();
		c.Collcod(334);
		c.Collegename("KRCE");
		Student s= new Student();
		s.studentid(86430);
		s.studentname("ABCDE");
		Department d=new Department();
		d.Deptid(1);
		d.Deptname("CSE");
		

	}

}
