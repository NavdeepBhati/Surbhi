package StreamsDemo;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	List<Person> roster = Person.createRoster();
	        roster.stream().filter(e -> e.getGender()== Person.Sex.MALE)
	        				.forEach(e -> System.out.println(e.getName()));
	        roster.stream().filter(e -> e.getGender()== Person.Sex.MALE)
			.forEach(e -> System.out.println(e.getAge()));
	       
	        double average= roster.stream().filter(e -> e.getGender()== Person.Sex.MALE)
	        					  .mapToInt(Person::getAge)
	        					  .average().getAsDouble();
	        System.out.println("The average age of all males are "+average);
	        
	        int sum= roster.stream().filter(e -> e.getGender()== Person.Sex.MALE)
	        				.mapToInt(Person::getAge).reduce(0,(a,b) -> a+b);
	        System.out.println("Sum ="+sum);
	        
	        List<String> namesOfMales= roster.stream().filter(e -> e.getGender()== Person.Sex.MALE)
	        								.map(Person::getName).collect(Collectors.toList());
	        System.out.println(namesOfMales);
	}

}
