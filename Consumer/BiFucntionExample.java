package java8.Consumer;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class BiFucntionExample {
    static BiFunction<String,String,String> bf1=(a,b) -> (a+" "+b);
    static Predicate<Person> p1= per-> per.getHeight() >= 140;
	static Predicate<Person> p2= per-> per.getGender().equals("Male");

    static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> vf1= (listofpersons,predicate) -> {
    	 Map<String,Double> map=new HashMap<String,Double>();
    	 listofpersons.forEach(per -> {
    		 if(p1.and(predicate).test(per))
    			 map.put(per.getName(), per.getSalary());
    	 });
    	 return map;
    };
	public static void main(String[] args) {
	
    // System.out.println("Result : "+bf1.apply("java", "features"));
		List<Person> personcons= PersonRepository.getAllPersons();
		Map<String,Double> map= vf1.apply(personcons,p2);
		System.out.println(map);

	}

}
