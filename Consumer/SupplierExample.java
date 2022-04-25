package java8.Consumer;

import java.util.List;
import java.util.function.Supplier;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class SupplierExample {
	static Supplier<Person> s1 = () -> PersonRepository.getPerson();
	static Supplier<List<Person>> s2 = () -> PersonRepository.getAllPersons();
	public static void main(String[] args) {

		
		//System.out.println(s1.get());
		//List<Person> personList= PersonRepository.getAllPersons();
	   
     System.out.println("Result : "+s2.get());
	}

}
