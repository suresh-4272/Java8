package java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamMapEx {
	
	static List<String> toUppertransform(List<Person> listofpersons){
		return listofpersons.stream()
				.map(Person :: getName)
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		List<String> names= new ArrayList<>();
		names.add("apple");
		names.add("banana");
		names.add("Orange");
		names.add("pineapple");
		
		List<Integer> nameslength = names.stream()
		.map(String :: length )
		.peek(System.out :: print)
		.collect(Collectors.toList());
		
		System.out.println(nameslength);
		System.out.println(toUppertransform(PersonRepository.getAllPersons()));

	}

}
