package org.Collegeinfo;

public final class Stat {
	int i=5;
	static int id = 5;

	

	public void empname() {
		i++;
		id++;
		System.out.println(i);
		System.out.println(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stat s=new Stat();
		s.empname();
		Stat s1=new Stat();
		s1.empname();
		Stat s2=new Stat();
		s2.empname();

	}

}
