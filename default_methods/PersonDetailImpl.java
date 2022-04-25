package java8.default_methods;

import java.util.List;

import java8.repo.Person;

public class PersonDetailImpl implements PersonDetails {
	
	public double calculateTotalSalary(List<Person> personList) {
		return personList.stream().map(Person :: getSalary).reduce(0d, (x,y)-> x+y);
	}

}
