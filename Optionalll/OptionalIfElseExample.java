package java8.Optionalll;

import java.util.Optional;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class OptionalIfElseExample {

	public static void main(String[] args) {
		orElse();
		orElseGet();
		orElseThrow();
		

	}
    static void orElse() {
    	Optional<Person> person = PersonRepository.getPersonOptional();
    	String name = person.isPresent()?person.get().getName():"NOT FOUND";
    	//String name = person.map(Person :: getName).orElse("Data Not Found ");
    	System.out.println("OrElse Person Name :"+name);			
    }
    static void orElseGet() {
    	Optional<Person> person = PersonRepository.getPersonOptional();
    	//String name = person.isPresent()?person.get().getName():"NOT FOUND";
    	String name = person.map(Person :: getName).orElseGet(()->"Data not found");
    	System.out.println("OrElse Person Name :"+name);			
    }
    static void orElseThrow() {
    	Optional<Person> person = PersonRepository.getPersonOptional();
    	//String name = person.isPresent()?person.get().getName():"NOT FOUND";
    	String name = person.map(Person :: getName).orElseThrow(()-> new RuntimeException("Not Found"));
    	System.out.println("OrElse Person Name :"+name);			
    }
}
