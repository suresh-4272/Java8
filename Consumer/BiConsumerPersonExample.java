package java8.Consumer;

import java.util.List;
import java.util.function.BiConsumer;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class BiConsumerPersonExample {
	
	static void printPersonDetails() {
		BiConsumer<String,List<String>> personconsumer=(name,hobbies) -> System.out.println(name +"  "+hobbies);
		BiConsumer<String,Double> salaryconsumer=(name,salary) -> System.out.println(name +"  "+salary);
		List<Person> personList= PersonRepository.getAllPersons();
		personList.forEach(per -> personconsumer.accept(per.getName(),per.getHobbies()));
		personList.forEach(per -> salaryconsumer.accept(per.getName(),per.getSalary()));
	}

	public static void main(String[] args) {
		
		printPersonDetails();
		

	}

}
