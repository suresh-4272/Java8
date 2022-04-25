package java8.default_methods;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class defaultEXample {

	public static void main(String[] args) {

       List<String> nameList = PersonRepository.getAllPersons()
    		   .stream().map(Person :: getName)
    		   .collect(Collectors.toList());
		/*
		 * System.out.println("Before Sort"); nameList.forEach(name ->
		 * System.out.println(name)); Collections.sort(nameList);
		 * System.out.println("After Sort"); 
		 nameList.forEach(name -> System.out.println(name));
		 */
       nameList.sort(Comparator.naturalOrder());
  	 nameList.forEach(name -> System.out.println(name));
  	nameList.sort(Comparator.reverseOrder());
 	 nameList.forEach(name -> System.out.println(name));




	}

}
