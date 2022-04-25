package java8.Optionalll;

import java.util.Optional;

import java8.repo.Address;
import java8.repo.Person;
import java8.repo.PersonRepository;

public class OptionalMapExample {

	public static void main(String[] args) {
		
		mapExample();
		flatmapExample();
		mapFilterExample();
	}
     
	static void mapExample() {
		Optional<Person> per= PersonRepository.getPersonOptional();
		per.ifPresent(person -> {
			String name= per.map(Person :: getName).orElse("NO Data");
			System.out.println(name);
		});
	}
		static void flatmapExample() {
			Optional<Person> per= PersonRepository.getPersonOptional();
			if(per.isPresent()) {
				Optional<Address> add  =  per.flatMap(Person :: getAddress);
			System.out.println(add.get());
			}
		}
		static void mapFilterExample() {
			Optional<Person> per= PersonRepository.getPersonOptional().filter(person -> person.getHeight()>=140);
			per.ifPresent(person -> {
				System.out.println(person.getAddress().get());
			});
		}

}
