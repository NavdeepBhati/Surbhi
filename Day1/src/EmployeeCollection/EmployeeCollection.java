package EmployeeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollection {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee("a1","abc",1000));
		employees.add(new Employee("a3","abc2",1000));
		employees.add(new Employee("a2","abc1",2000));
		
	//Collections.sort(employees, (Employee e1,Employee e2)->  e1.getEmpId().compareTo(e2.getEmpId()));
	Collections.sort(employees,Employee::compareById);
		System.out.println(employees);
		System.out.println("Salaries before update: ");
		employees.forEach(e-> System.out.print(e.getSalary()+" "));
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		System.out.println("\nSalaries after update: ");
		employees.forEach(e-> System.out.print(e.getSalary()+" "));
	}
	
}
