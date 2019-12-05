package com.learn.predicates;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		//return (e1.name.compareTo(e2.name));
		return (e1.getId().compareTo(e2.getId()));
	}
	public static int compareByName(String s1, String s2) {
		return s1.compareTo(s2);
	}

}
