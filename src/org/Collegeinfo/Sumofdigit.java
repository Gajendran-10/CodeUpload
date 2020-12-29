package org.Collegeinfo;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int rem, count = 0;
		while (n != 0) {
			rem = n % 10;
			count = (count) + rem;
			n = n / 10;
		}
		System.out.println("Sum of digit is "+count);
	}

}
