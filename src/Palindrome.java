import java.util.Scanner;

// Given number is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int i=s.nextInt();
		int n=i;
		int rem, count=0;

		do {
			rem= i%10;
			count=(count*10)+rem;
			i=i/10;
		}while(i!=0);
		
		if(n==count)
		{
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not palindrome");
		}

		
		 s.close();
	}

}
