package org.capgemini.daimler;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(40);
		l.add(400);
		l.add(10);
		l.add(30);
		l.add(400);
		l.add(10);
		l.add(30);
		Set<Integer> z= new LinkedHashSet<Integer>();
		z.addAll(l);
		System.out.println("WithDuplicate:"+l);
		System.out.println("WithoutDuplicate:"+z);
		System.out.println("Count of Duplicate: "+(l.size()-z.size()));
	
		
		
			}

}
