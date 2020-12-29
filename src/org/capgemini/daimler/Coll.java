package org.capgemini.daimler;
 import java.util.*;
 import java.security.*;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Coll extends Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Object> li=new ArrayList<Object>(); li.add("Ravi"); li.add(10);
		 * li.add(10); System.out.println(li);
		 * 
		 * HashSet<Object> h = new HashSet<Object>(); h.addAll(li);
		 * 
		 * 
		 * System.out.println(h);
		 */
		/*
		 * Iterator<Object> i = li.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 * 
		 */
		
		Map<Integer,Emp> m= new HashMap<Integer,Emp>();
		/*
		 * m.put(10,"Gajen"); m.put(20, "Elam");
		 * 
		 * System.out.println(m);
		 */
		
		Emp e1=new Emp();
		e1.setId(10);
		e1.setName("rrrr");
		m.put(1, e1);
		
		Set<java.util.Map.Entry<Integer, Emp>> entr= m.entrySet();
		
		for(java.util.Map.Entry<Integer, Emp> x:entr)
		{
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
		}
	}

}
