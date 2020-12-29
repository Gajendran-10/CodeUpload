
public class Oddfive {
	public static void main(String[] args)
	{
		int count=0;
	
		for(int i=1;i<=500;i++)
		{
			if(i%2!=0)
			{
				count=count+1;
			}
		}
		System.out.println("Count of Odd number within 1 to 500: "+count);
	}
	

}
