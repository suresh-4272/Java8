package java8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import java8.repo.Person;

public class BiConsumerExample {

	public static void main(String[] args) {
		//Consumer<String> con1=(s) -> System.out.println(s.toUpperCase());
		
		/*
		 * con1.accept(20, 20);
		 * 
		 * List<Integer> list1=Arrays.asList(new Integer(10),new Integer(20),new
		 * Integer(20)); List<Integer> list2=Arrays.asList(new Integer(10),new
		 * Integer(20)); BiConsumer<List<Integer>,List<Integer>> con2=(l1,l2) -> {
		 * if(l1.size()== l2.size()) { System.out.println("True");
		 * 
		 * } else System.out.println("False"); };
		 * 
		 * con2.accept(list1, list2);
		 */
		BiConsumer<Integer,Integer> add=(a,b) -> System.out.println("Add : "+(a+b));
		BiConsumer<Integer,Integer> sub=(a,b) -> System.out.println("Sub : "+(a-b));
		BiConsumer<Integer,Integer> mul=(a,b) -> System.out.println("Mul : "+(a*b));
		add.andThen(sub).andThen(mul).accept(20, 20);
		

	}

}
