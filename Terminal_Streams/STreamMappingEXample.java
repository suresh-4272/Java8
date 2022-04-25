package java8.Terminal_Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class STreamMappingEXample {
	
	static List<String> mappingName(){
		List<String> names =PersonRepository.getAllPersons().stream()
		.map(Person :: getName).collect(Collectors.toList());
		
		List<String> names1 =PersonRepository.getAllPersons().stream().collect(mapping(Person::getName,Collectors.toList()));
		
		
	return names1;
	}
	static Set<String> mappingName1(){
		List<String> names =PersonRepository.getAllPersons().stream()
		.map(Person :: getName).collect(Collectors.toList());
		
		Set<String> names1 =PersonRepository.getAllPersons().stream().collect(mapping(Person::getName,Collectors.toSet()));
		
		return names1;
	}
	static long mappingName2(){
				
		return PersonRepository.getAllPersons().stream()
				.filter(per -> per.getHeight()>=140)
				.collect(Collectors.counting()
				);
	
	}
	

	public static void main(String[] args) {
		
		System.out.println(mappingName());
		System.out.println(mappingName1());
		System.out.println(mappingName2());
		

	}
}
