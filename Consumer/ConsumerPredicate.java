package java8.Consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class ConsumerPredicate {
	static Predicate<Person> p1= per-> per.getHeight() >= 140;
	static Predicate<Person> p2= per-> per.getGender().equals("Male");
	static BiConsumer<String,List<String>> hobbiesconsumer=(name,hobbies) -> System.out.println(name +"  "+hobbies);
	static Consumer<Person> personConsumer=(per) -> {
		
		if(p1.and(p2).test(per)) {
		  hobbiesconsumer.accept(per.getName(),per.getHobbies());
		}
		
	};
	public static void main(String[] args) {
		
		List<Person> personList= PersonRepository.getAllPersons();
		personList.forEach(personConsumer);
	

	}

}
