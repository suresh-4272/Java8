package java8.Streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class FindAnyFirstExample {
	static Predicate<String> p1 = num -> num.length() > 7 ;
	static Predicate<Person> p2 = per -> per.getHeight() < 140;
	static Predicate<Person> p3 = per -> per.getGender().equals("llll");

	public static void main(String[] args) {
		
		
		System.out.println(PersonRepository.getAllPersons()
		.stream()
		.filter(p2)
		.findAny().get());
		
		Optional<Person> findAny = findany();
		if(findAny.isPresent()) {
		System.out.println(findany().get());
		}
		else
			System.out.println("NULL");
	/*	List<Person> list1 = PersonRepository.getAllPersons();
		list1.stream().filter(p2).collect(Collectors.toList()).forEach(System.out :: println);;
		*/

	}
	static Optional<Person> findany() {
		return PersonRepository.getAllPersons()
				.stream()
				.filter(p3)
				.findFirst();
	}

}
