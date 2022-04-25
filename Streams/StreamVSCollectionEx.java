package java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamVSCollectionEx {

	 public static void main(String[] args) {
		 List<String> names= new ArrayList<String>();
		 names.add("Surya");
		 names.add("Adam");
		 names.add("Adam");
		 
		 for(String name:names) {
			 System.out.println(">>>>"+name);
		 }
		 
		 Stream<String> s1= names.stream().distinct();
	     s1.forEach(p-> System.out.println(">>>>> : "+p));
	     
	     List<String> personNames = PersonRepository.getAllPersons()
	    		 .stream()
	    		 .peek(System.out:: println)
	    		// .peek(per -> System.out.println(per))  //doubt
	    		 .map(Person :: getName)
	    		 .peek(System.out :: println)
	    		 .collect(Collectors.toList());
	     
		 
		
	 }
}
