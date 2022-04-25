package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class flatMapExample {
	
	static List<String> hobbies(List<Person> per){
		return per.stream()
				.map(Person :: getHobbies) //collecting objects(info)
		.flatMap(List :: stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
	}
	static long counthobbies(List<Person> per){
		return per.stream()
				.map(Person :: getHobbies) //collecting objects(info)
		.flatMap(List :: stream)
		.distinct()
		.count();
	}
			
	
	
	public static void main(String[] args) {
		List<Integer> oddNumber = Arrays.asList(1,3,5,7,9);
		List<Integer> evenNumber = Arrays.asList(2,4,6,8);
		
		List<List<Integer>> listoflist=Arrays.asList(oddNumber,evenNumber);
	    System.out.println("Before Flatten : "+listoflist);
	    
	    List<Integer> flattenList = listoflist.stream()
	    		.flatMap(list -> list.parallelStream())
	    	//	.peek(System.out :: println)
	    		.collect(Collectors.toList());
	    System.out.println("After Flatten : "+flattenList);
	    System.out.println("Person Flatten : "+hobbies(PersonRepository.getAllPersons()));
	    System.out.println("Person Flatten : "+counthobbies(PersonRepository.getAllPersons()));
	}

}
