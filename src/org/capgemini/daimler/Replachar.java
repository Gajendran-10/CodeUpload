package org.capgemini.daimler;

public class Replachar {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String s = "CTS@1234";
		System.out.println("Before Replace: " + s);
		String rep = s.replace("CTS", "TCS");
		System.out.println("After Replace: " + rep);

		String s1=s.substring(3,5);
		System.out.println(s1);
	}

}
