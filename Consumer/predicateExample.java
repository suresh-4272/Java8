package java8.Consumer;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class predicateExample {
	static Predicate<Person> p1= per-> per.getHeight() >= 140;
	static Predicate<Person> p2= per-> per.getGender().equals("Male");
	
	public static void main(String[] args) {
		Predicate<Integer> lessThan=a -> a<=50;
		Predicate<Integer> greaterThan=a -> a>=50;
		Predicate<Integer> equalTo=a -> a==50;
		System.out.println("lessThan :  "+lessThan.test(55));
		System.out.println("greaterThan :  "+greaterThan.test(55));
		System.out.println("equalTo :  "+equalTo.test(50));
		
		boolean result= lessThan.and(greaterThan).and(equalTo).test(55);
		System.out.println("Result :  "+result);
		boolean result1= lessThan.or(greaterThan).and(equalTo).test(50);
		System.out.println("Result :  "+result1);
		result1= lessThan.or(greaterThan).negate().test(50);
		System.out.println("Result :  "+result1);
		
		//predicate Accept Stream
		List<Person> list1=PersonRepository.getAllPersons();
		
		list1.stream().filter(p1).collect(Collectors.toList());
		
		list1.forEach(per -> {
			if(p1.and(p2).test(per)) {
				System.out.println(per);
			}
		});
		
		
	}

}
