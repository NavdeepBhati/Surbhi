package EmployeeCollection;

import java.util.Comparator;

 class IdComparator implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2){  
	  
		return e1.empId.compareTo(e2.empId);  
		}  
		 
}
