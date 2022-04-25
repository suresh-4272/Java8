package java8.Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =IntStream.rangeClosed(1, 50).sum();
		System.out.println(sum);
		OptionalInt max= IntStream.rangeClosed(1, 50).max();
		System.out.println(max.getAsInt());
		
		OptionalDouble avg= LongStream.rangeClosed(1, 50).average();
		System.out.println(avg.getAsDouble());

	}

}
