package java8.Streams;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
	
	static UnaryOperator<Integer> add= (x) -> x+5;

	public static void main(String[] args) {
		
		Stream<Integer> s1= Stream.iterate(0, add).limit(10);
	    s1.forEach(System.out :: println);
		
	    Stream<Double> s2=Stream.generate(Math :: random).limit(10);
	    s2.forEach(System.out :: println); // integer ??
	    
	    
	    Stream<Integer> s3=Stream.of(1,2,3,4);
	    s3.forEach(System.out :: println);
	}

}
