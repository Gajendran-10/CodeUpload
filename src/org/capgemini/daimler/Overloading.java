package org.capgemini.daimler;

public class Overloading {
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum: "+sum);
		
	}
	public void add(int re,float ps,int fe)
	{
		float log=re+ps+fe;
		System.out.println("sum: "+log);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.add(4, 7);
		o.add(34, 4f, 45);

	}

}
