package java8.Optionalll;

import java.util.Optional;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class OptionalExample {

	public static void main(String[] args) {
		System.out.println(myName("Suresh"));
		Optional<String> name = Optional.ofNullable(myName("Suresh"));
		System.out.println(name.isPresent()?name.get():"not found");
		System.out.println(personName(new Person()));
		System.out.println(" Person Optional: "+personNamewithOptional(PersonRepository.getPersonOptional()).get());
		

		

	}
	static String myName(String name) {
		
		return name;
	}
	static String personName(Person per) {
		if(per!=null)
			return per.getName();
		else
			return "No data Record";
	}
	static Optional<String> personNamewithOptional(Optional<Person> per) {
		if(per.isPresent())
			return per.map(Person :: getName);
		else
			return Optional.empty();
	}

}
