package java8.Consumer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class FunctionExample {
	
	//static Function<String, String> f1= name -> name.toUpperCase();
	//static Function<String, String> f2= name -> name.toUpperCase().concat(" Hosamani");
	static Function<String, Integer> f1= name -> name.length();
	static Function<List<Person>,Map<String,Double>> f3= personList ->
	{   Map<String,Double> map=new HashMap<String,Double>();
		personList.forEach(per -> {
			map.put(per.getName(),per.getSalary());	
		});
		return map;
	};

	public static void main(String[] args) {
		
		//System.out.println("Result : "+f1.apply("suresh"));
		//System.out.println("Result : "+f2.apply("suresh"));
		//System.out.println("And then result "+f1.andThen(f2).apply("Suresh "));
		//System.out.println("compose Result "+f1.compose(f2).apply("Suresh "));
		List<Person> personcons= PersonRepository.getAllPersons();
		Map<String,Double> map= f3.apply(personcons);
		System.out.println(map);
		

	}

}
