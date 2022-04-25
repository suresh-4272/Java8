package java8.default_methods;

import java.util.List;
import java.util.stream.Collectors;

import java8.repo.Person;

public interface PersonDetails {
	
	double calculateTotalSalary(List<Person> personList);
	
	default int totalKids(List<Person> personList) {
		return personList.stream()
				.map(Person :: getKids)
				.reduce(0, (x,y)-> x+y);
	}
	
	static List<String> personName(List<Person> personList){
		
		return personList.stream()
				.map(Person :: getName)
				.collect(Collectors.toList());
		
	}

}
