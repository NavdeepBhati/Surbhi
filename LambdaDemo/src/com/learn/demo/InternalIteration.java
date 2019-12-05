package com.learn.demo;

import java.util.ArrayList;
import java.util.List;

public class InternalIteration {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("7","Shailesh B"));
		empList.add(new Employee("5", "Sandeep Garg"));
		empList.add(new Employee("6", "Sahil Shaha"));
		empList.add(new Employee("9","Piyush Patel"));
		
		empList.forEach(InternalIteration::count);
		
        System.out.println("Total employee:"+total); 
	}
	
	public static void count(Employee e1) {
        total = total + 1;
    }
    static int total = 0;
}
