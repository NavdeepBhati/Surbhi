package PredicatesDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {

	public static Predicate<Employee> isAdultMale(){
		return t2 -> t2.getAge()>21 && t2.getGender().equalsIgnoreCase("M");
	}
	public static Predicate<Employee> isAdultFemale(){
		return t2 -> t2.getAge()>18 && t2.getGender().equalsIgnoreCase("F");
	}
	public static Predicate<Employee> isAgeMoreThan(Integer age){
		return t2 -> t2.getAge()>age;
	}

	  public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
		  	
	        return employees.stream().filter( predicate ).collect(Collectors.<Employee>toList());
	  }
	
}
