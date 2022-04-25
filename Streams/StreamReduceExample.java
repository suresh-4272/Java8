package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamReduceExample {

	public static void main(String[] args) {

       /*   List<Integer> listofIntegers = Arrays.asList(1,2,3,4,5);
          int sum = listofIntegers.stream().mapToInt(i -> i).sum();
          System.out.println(sum);
          
         System.out.println(listofIntegers.stream().reduce(3, (a,b)-> a*b));
          */
		
		combine();
		Optional<Person> tallest = gettallestPerson();
		
		System.out.println(tallest.get());

	}

	private static void combine() {
		String names=PersonRepository.getAllPersons()
		.stream()
		.map(Person :: getName)
		.reduce("", (a,b)-> a.concat(b) )
		;
		System.out.println(" Names are : "+names);
	}
    static Optional<Person> gettallestPerson() {
    	return PersonRepository.getAllPersons()
    	.stream()
    	.reduce((x,y) -> x.getHeight() > y.getHeight()? x:y);
    	
    }
}
