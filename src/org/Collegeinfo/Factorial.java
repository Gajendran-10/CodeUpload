package org.Collegeinfo;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
int n=s.nextInt();
int fact=1;

while(n!=0)
{
	fact=fact*n;
	--n;
}

System.out.println("Factorial of given number: "+fact);
s.close();
	}

}
