// Sum of odd numbers from 1 to 600
public class Oddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=600;i++)
		{
			if(i%2!=0)
			{
				count=count+i;
			}
		}
		System.out.println("Sum of odd number from 1 to 600: "+count);

	}

	}


