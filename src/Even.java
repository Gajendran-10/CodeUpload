import java.util.*;
public class Even {
 
 public static void main(String[] args)
 {
	
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter Number");
	 int n=s.nextInt();
	 if(n%2==0)
	 {
		 System.out.println("Entered Number "+n+" ïs even");
	 }
	 else {
		 System.out.println("Entered Number "+n+" ïs odd"); 
	 }
	 
	 System.out.println("UPdated statement")
	 s.close();
 }
}
