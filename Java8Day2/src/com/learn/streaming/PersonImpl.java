package com.learn.streaming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class PersonImpl {

	public static void main(String[] args) {
		Person.createRoster().stream().filter(e->e.getGender()==Person.Sex.MALE).forEach(e->System.out.println(e.getName()));
		
		ArrayList arrPerson = (ArrayList) Person.createRoster().stream().filter(e->e.getGender()==Person.Sex.MALE).collect(Collectors.toList());
		
		arrPerson.forEach(e->System.out.println(((Person) e).getName()));
		
		double average = Person.createRoster().stream().filter(p->p.getGender()==Person.Sex.MALE).mapToInt(Person::getAge).average().getAsDouble();
		System.out.println(average);
		double average1 = Person.createRoster().stream().filter(p->p.getGender()==Person.Sex.MALE).mapToInt(p->p.getAge()).average().getAsDouble();
		System.out.println(average1);
		
		double average2 = Person.createRoster().stream().filter(p->p.getGender()==Person.Sex.MALE).mapToInt(p->p.getAge()).reduce(0, (a,b)->a+b);
		System.out.println(average2);

		double average3 = Person.createRoster().stream().filter(p->p.getGender()==Person.Sex.MALE).mapToInt(p->p.getAge()).reduce(0, Integer::max);
		System.out.println(average3);
		
		
		/*
		double average1 = Person.createRoster().stream().filter(Person::getGender==Person.Sex.MALE).mapToInt(p->p.getAge()).average().getAsDouble();
		System.out.println(average1);
		*/
	}
}
