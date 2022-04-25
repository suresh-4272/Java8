package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
     static int calculatesum(List<Integer> l1) {
    	 return l1.stream().reduce(0, (x,y)-> x+y);
     }
     static int calculateSumwithStream(IntStream intStream) {
    	 return intStream.sum();
     }
	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(1,2,3,4,5,6);
		System.out.println(calculatesum(l1));
		
		IntStream intStream = IntStream.rangeClosed(1, 6);
		System.out.println(calculateSumwithStream(intStream));
       
	}

}
