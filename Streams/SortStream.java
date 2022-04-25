package java8.Streams;

import java.util.Comparator;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class SortStream {

	public static void main(String[] args) {
		PersonRepository.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person :: getName)/*.reversed()*/)
		.forEach(System.out :: println);

	}

}
