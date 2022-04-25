package java8.Terminal_Streams;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamGroupingBYExample {
	
	
	static Map<Object, List<Person>> groupByGender() {
		return PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(per -> per.getGender().equals("Male")?"Male":"Female"));
	}
	
	static void groupByGender2() {
		Map<Object, List<Person>> groupData = PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(Person :: getGender));
		//groupData.entrySet().forEach(per -> System.out.println("Key : "+per.getKey()+"/value"+per.getValue()));
	    Stream.of(groupData).forEach(System.out :: println);
	}
	
	static void twoLevelGrouping() {
		Map<String,Map<String,List<Person>>> groupeddata =PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(Person :: getGender, groupingBy(per -> per.getHeight()>=140?"Tallest":"Shortest")));
		Stream.of(groupeddata).forEach(System.out :: println);
	}
	
	static void twoLevelGroupingCount() {
		Map<String,Integer> grp =PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(Person :: getName, summingInt(Person :: getKids)));	
		// .collect(Collectors.groupingBy(Person :: getName , HashMap ::new, Collectors.toList()));
		Stream.of(grp).forEach(System.out :: println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(groupByGender());
         groupByGender2();
         twoLevelGrouping();
         twoLevelGroupingCount();

         
	}

}
