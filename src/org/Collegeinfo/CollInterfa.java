package org.Collegeinfo;
// Interface program example
public  class CollInterfa implements Studdet, Colldet {
	public void Studid()
	{
		System.out.println("123");
	}
public void Studname()
{
	System.out.println("SJdjs");
}

public void Collegenam() {
	System.out.println("KRCE");
}

public void Collcod()
{
	System.out.println("234433");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CollInterfa f= new CollInterfa();
f.Collegenam();
f.Collcod();
f.Studid();
f.Studname();
	}

}
