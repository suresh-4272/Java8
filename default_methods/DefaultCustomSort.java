package java8.default_methods;

import java.util.Comparator;
import java.util.List;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class DefaultCustomSort {
	
	static Comparator<Person> c1=Comparator.comparing(Person :: getName);
	static Comparator<Person> c2=Comparator.comparing(Person :: getHeight);
	public static void main(String[] args) {
		
		List<Person> listofper= PersonRepository.getAllPersons();
		//sortByName(listofper);
	//	sortByHeight(listofper);
		sortByHeightAndName(listofper);
		sortByNamewithnull(listofper);

		
	}
	
	static void sortByName(List<Person> listofper) {
		
		listofper.sort(Comparator.comparing(Person :: getName));
		listofper.forEach(per ->System.out.println(per));
		
	}
static void sortByHeight(List<Person> listofper) {
		
		listofper.sort(c2);
		listofper.forEach(per ->System.out.println(per));
		
	}
static void sortByHeightAndName(List<Person> listofper) {
	
	listofper.sort(c1.thenComparing(c2));
	listofper.forEach(per ->System.out.println(per));
	
}
static void sortByNamewithnull(List<Person> listofper) {
	 Comparator<Person> nullcomp=Comparator.nullsFirst(c1);
	 listofper.sort(nullcomp);
		listofper.forEach(per ->System.out.println(per));

	 
	 
}

}
