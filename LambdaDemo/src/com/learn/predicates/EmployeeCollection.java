package com.learn.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollection {
	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public static void printEmployee () {
		for (Employee e : employeeList) {
			System.out.println(e.getFirstName());
		}
	}
	
	public static void main(String args[])
	{
		
		Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");
        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
        Employee e10 = new Employee(10,45,"M","Naveen","Jain");
         
        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
        //EmployeePredicates predicate = new EmployeePredicates();
        
        System.out.println( EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(40)));
        
        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultMale()));
        
        
        
		/*employeeList.add(new Employee(1,"John",1000));
		employeeList.add(new Employee(2,"Mary",2000));
		employeeList.add(new Employee(3,"Jane",3000));*/
		
		/*for (Employee e: employeeList) {
			e.salary=e.salary*2;
		}*/
		
		/*employeeList.forEach(e->e.setSalary(e.getSalary()*2));
		
        Collections.sort(employeeList,Employee::compareByName);
        printEmployee();
        Collections.sort(employeeList,(e1,e2)->{  
            return e1.name.compareTo(e2.name);  
            });
        */
		//employeeList.sort(new EmployeeComparator());
		//employeeList.sort(employeeList, (Employee p1, Employee p2)->p1.emp);
		//Collections.sort(employeeList, (e1, e2)-> e1)
		
		/*employeeList.sort(employeeList,new Comparator<Employee>() {
		});*/
		printEmployee();
		
	}	

	
}
