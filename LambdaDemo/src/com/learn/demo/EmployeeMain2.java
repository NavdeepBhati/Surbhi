package com.learn.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("7","Shailesh B"));
		empList.add(new Employee("5", "Sandeep Garg"));
		empList.add(new Employee("6", "Sahil Shaha"));
		empList.add(new Employee("9","Piyush Patel"));
		
		/*Collections.sort(empList, new Comparator<Employee>(){
			public int compare(Employee e1, Employee e2)
			{
				return e1.getEmpName().compareToIgnoreCase(e2.getEmpName());
			}
		});
		
		for(Employee e : empList){
			System.out.println(e);
		}*/
		
		Collections.sort(empList, (Employee a, Employee b) -> {return a.getEmpName().compareToIgnoreCase(b.getEmpName());} );
		
		for(Employee e : empList){
			System.out.println(e);
		}
	}
	
	
}
