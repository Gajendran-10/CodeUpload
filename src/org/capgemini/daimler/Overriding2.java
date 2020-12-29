package org.capgemini.daimler;

public class Overriding2 extends Overriding1 {
	
	public void dem()
	{
		System.out.println("Name of user");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 o2=new Overriding2();
		o2.dem();
		o2.dem("ABC");

	}

}
