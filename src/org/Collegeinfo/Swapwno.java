package org.Collegeinfo;
import java.util.*;
import java.util.Scanner;

public class Swapwno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number a: ");
		a = s.nextInt();
		System.out.println("Enter the Second number b: ");
		b = s.nextInt();
		System.out.println("Before Swap: "+a+" "+b);
		

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After  Swap: "+a+" "+b);
		s.close();

	}

}
