package com.learn.streaming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<Person> roster = Person.createRoster();
		
		for(Person p: roster)
			System.out.println("Conventional: " + p.getName());
		
		roster.stream().forEach(e -> System.out.println("Stream: " +e.getName()));
		
		roster.stream().filter(e -> e.getGender() == Person.Sex.MALE)
		.forEach(e -> System.out.println("MALE:" + e.getName()));;
		
		double d = roster.stream().filter(e -> e.getGender() == Person.Sex.MALE)
		.mapToInt(p -> p.getAge())
		.average()
		.getAsDouble();
		
		System.out.println("DOUBLE :" + d);
		
		Integer totalAge = roster.stream().mapToInt(Person::getAge)
				.sum();

		Integer totalAgeReduce = roster.stream().mapToInt(Person::getAge)
				.reduce(0,
						(a,b) -> (a+b));
		
		System.out.println("Total Age:" + totalAge + ":"+totalAgeReduce);

		List<String> nameOfMalesPersons = roster
											.stream()
											.filter(PersonPredicates.isAdultMale())
											.map(p -> p.getName())
											.collect(Collectors.toList());
		
		nameOfMalesPersons.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		
		List<String> persons = roster.stream().map(p -> p.getName()).sorted().map(String::toUpperCase).collect(Collectors.toList());
		
		if(roster.stream().anyMatch(p -> p.getName().startsWith("A")))
			System.out.println("-----------------------------------------" );

	}

}

class PersonPredicates {
	public static Predicate<Person> isAdultMale() {
		return t2 -> t2.getGender()==Person.Sex.MALE;
	}
}