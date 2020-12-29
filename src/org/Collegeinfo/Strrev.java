package org.Collegeinfo;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated 
		System.out.println("Input:");
Scanner sc=new Scanner(System.in);

String s=sc.next();
StringBuffer sb1=new StringBuffer(s);

StringBuffer strrev=sb1.reverse();

if(sb1==strrev)
{
	System.out.println("True");
}
else
{System.out.println("False");
	}
	}
}
