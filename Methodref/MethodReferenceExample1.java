package java8.Methodref;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class MethodReferenceExample1 {
	
	static Function<String, String> f1 = name -> name.toUpperCase();
	static Function<String, String> f2 = String :: toUpperCase;
	
	static Predicate<Person> p1 = per -> per.getHeight() >= 140;
	static Predicate<Person> p2 = MethodReferenceExample1:: heightCheck;
	static BiPredicate<Person,Integer> p3 = MethodReferenceExample1:: heightCheckwithparam;


	public static void main(String[] args) {
		
		//System.out.println("Lambda Expression : "+f1.apply("Suresh"));
		//System.out.println("Method Reference : "+f2.apply("Suresh"));
		System.out.println("Predicate 1 Result "+p1.test(PersonRepository.getPerson()));
		System.out.println("Predicate 2 Result "+p2.test(PersonRepository.getPerson()));
		System.out.println("Predicate 3 Result "+p3.test(PersonRepository.getPerson(),145));

	}
	
	static boolean heightCheck(Person per) {
		return per.getHeight()>=140;
	}
	static boolean heightCheckwithparam(Person per,Integer height) {
		return per.getHeight()>= height;
	}

}
