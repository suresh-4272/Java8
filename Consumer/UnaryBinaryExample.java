package java8.Consumer;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {
	
	static UnaryOperator<String> u1= name -> name.toUpperCase();
	static UnaryOperator<Integer> u2= a-> a+10;
	static Comparator<Integer> comp= (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		//System.out.println("Result 1: "+u1.apply("Java8"));
		//System.out.println("Result 2: "+u2.apply(10));
		
		BinaryOperator<Integer> bo1= BinaryOperator.maxBy((a,b)-> (a>b)?1:(a==b)?0:-1);
		System.out.println(bo1.apply(102, 105));
		
		BinaryOperator<Integer> bo2= BinaryOperator.maxBy(comp);
		System.out.println(bo2.apply(102, 105));
		
		BinaryOperator<Integer> bo3= BinaryOperator.minBy(comp);
		System.out.println(bo3.apply(102, 105));
		
		
	}

}
