package org.Collegeinfo;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapcoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Employee> m=new LinkedHashMap<Integer,Employee>();
		
		Employee e1=new Employee();
		e1.setId(10);
		e1.setName("SSS");
		m.put(1,e1);
		Set<java.util.Map.Entry<Integer, Employee>> entr=m.entrySet();
		
		for(java.util.Map.Entry<Integer,Employee> x: entr)
		{
			System.out.println("Id is "+x.getValue().getId());
			System.out.println("Name is "+x.getValue().getName());
		}
		

	}

}
