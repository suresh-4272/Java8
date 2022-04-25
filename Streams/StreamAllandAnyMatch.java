package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamAllandAnyMatch {
//	static Predicate<String> p1 = num -> num.length() > 7 ;
	//static Predicate<Person> p2 = per -> per.getHeight() > 140;
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple","Pineapple","Banana","Grapes","Orange");
	   System.out.println( names.stream()
		.allMatch(s -> s.length() > 6));
	   System.out.println( names.stream()
				.anyMatch(s -> s.length() > 6));
	   System.out.println("Person Any Match : " +PersonRepository.getAllPersons()
			   .stream()
			   .anyMatch(per -> per.getHeight() > 140)); 

	}

}
