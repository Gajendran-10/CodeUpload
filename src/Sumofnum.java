//Sum of number
public class Sumofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5678;
		int count=0;

	while(i!=0)
	{
		i=i/10;
		++count;
	}
System.out.println("Count of given number: "+count);
	}

}
