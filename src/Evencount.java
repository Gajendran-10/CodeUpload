// Count of even numbers
public class Evencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				count=count+i;
			}
		}
		System.out.println("Sum of even number from 1 to 10: "+count);

	}

}
