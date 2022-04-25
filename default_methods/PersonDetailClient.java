package java8.default_methods;

import java.util.List;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class PersonDetailClient {
	static List<Person> listofPersons =PersonRepository.getAllPersons();

	public static void main(String[] args) {
		
		
		PersonDetails pd= new PersonDetailImpl();
		System.out.println(pd.calculateTotalSalary(listofPersons));
		System.out.println(pd.totalKids(listofPersons));

    
		PersonDetails.personName(listofPersons).forEach(System.out::println);
		
		

	}

}
