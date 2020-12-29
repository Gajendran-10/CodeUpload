// Reverse the given number
import java.util.*;
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the number");
int i=s.nextInt();
int rem, count=0;

do {
	rem= i%10;
	count=(count*10)+rem;
	i=i/10;
}while(i!=0);

System.out.println("Reverse of given number: "+count);
 s.close();
 
	}

}
