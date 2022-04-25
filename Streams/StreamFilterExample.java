package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<String> names= Arrays.asList("sam","Anderson","Peter","Nancy");
         
		//Stream<String> allNames= names.stream();
		
		names.stream()
        .filter(s -> s.length() > 3 )
       // .collect(Collectors.toList())
        .forEach(System.out :: println);
		
		//PersonRepository.getAllPersons().stream().filter(per-> per.getHeight()>=150).forEach(System.out :: println);
		List<Person> p1=PersonRepository.getAllPersons()
				.stream()
				.filter(per-> per.getHeight()>=150)
				.collect(Collectors.toList());
		p1.forEach(System.out :: println);
		
	}

}
