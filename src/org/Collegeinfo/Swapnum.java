package org.Collegeinfo;

import java.util.*;

public class Swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number a: ");
		a = s.nextInt();
		System.out.println("Enter the Second number b: ");
		b = s.nextInt();
		System.out.println("Before Swap: "+a+" "+b);
		

		c = a;
		a = b;
		b = c;

		System.out.println("After  Swap: "+a+" "+b);
		s.close();

	}

}
