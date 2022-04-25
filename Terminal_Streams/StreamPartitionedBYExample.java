package java8.Terminal_Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamPartitionedBYExample {
	
	
	static void PartioningBYHeight() {
		Map<Boolean, List<Person>> height =PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(per -> per.getHeight()>140));
		
		Stream.of(height).forEach(System.out::println);
		
	}
	static void PartioningBYHeight2() {
		Map<Boolean, Set<Person>> height =PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(per -> per.getHeight()>140, Collectors.toSet()));
		
		Stream.of(height).forEach(System.out::println);
	}	
	static void PartioningBYHeightwithMap() {
		Map<Boolean, Map<String, List<String>>> height =PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(per -> per.getHeight()>140, Collectors.toMap(Person :: getName, Person :: getHobbies)));
		
		Stream.of(height).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		PartioningBYHeight();
		PartioningBYHeight2();
		PartioningBYHeightwithMap();

		

		
		
		
	}

}
