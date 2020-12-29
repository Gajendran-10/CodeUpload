package org.Collegeinfo;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number: ");
int n=s.nextInt();
int arm=n;
int rem,count=0;
while(n!=0)
{
	
rem=n%10;
count=count+(rem*rem*rem);
n=n/10;
	
}
if(arm==count)
{
	System.out.println("Given number is armstrong number");
}
else
{
	System.out.println("Givne number is not armstrong number");
}
s.close();
	}

}
