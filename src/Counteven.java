
public class Counteven {
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			count=count+1;
			}
		}
		
		System.out.println("Count of even number within 1 to 10:"+count);
	}

}
