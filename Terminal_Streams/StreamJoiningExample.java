package java8.Terminal_Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamJoiningExample {
	
	static String joiningExample() {
		String s= PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining("  "));
		return s;
	}

	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','e'};
		String join = Stream.of(ch).map(arr ->new  String(arr)).collect(Collectors.joining("-","[","]"));
		System.out.println(join);
		System.out.println(joiningExample());

	}

}
