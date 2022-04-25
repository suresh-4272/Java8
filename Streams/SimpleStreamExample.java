package java8.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class SimpleStreamExample {

	public static void main(String[] args) {
		
		
		
		/*  Stream<Integer> s1= Stream.of(1,2,3,4,5,6);
		  s1.forEach(p->
		  System.out.print(p));
		  
	/*	  for(int[] p : s1) {
			  System.out.println(p);
		  }
		  */
		  
	/*  Stream<Integer> s2= Stream.of(new Integer[] {1,2,3,4,5}); 
	/* s2.forEach(p->
		  System.out.print(p)); */
	  
	 /* for(int num : s2) {
		  System.out.println(num);
	  } */
		 
		Predicate<Person> p1=(per) -> per.getHeight() >=140;
		Predicate<Person> p2=(per) -> per.getGender().equals("Female");
		
		Map<String, List<String>> personmap= PersonRepository
				.getAllPersons() // iterate all persons
				.stream()  //stream of persons
				.filter(p1.and(p2))
				.collect(Collectors.toMap( Person :: getName, Person :: getHobbies));
		System.out.println("Person Map : "+personmap);
		
		
		/*List<Person> p1= PersonRepository.getAllPersons();
		System.out.println("Using List "+p1.stream().collect(Collectors.toMap(Person :: getName , Person :: getHeight)));
		*/
		List<String> p3= PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getHobbies)
			     .flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		System.out.println("  "+p3);
		
		
		}

}
