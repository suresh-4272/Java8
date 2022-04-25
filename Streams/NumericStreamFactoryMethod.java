package java8.Streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamFactoryMethod {

	
	public static void main(String[] args) {
	
		IntStream intStream1 = IntStream.rangeClosed(1, 6);
		IntStream intStream2 = IntStream.range(1, 555555555);
		LongStream intStream3 = LongStream.range(1, 555555555);
	//	DoubleStream intStream4 = DoubleStream.range(0,50);// ??
		LongStream.range(1, 55).asDoubleStream().forEach(System.out :: println);
	//	intStream1.forEach(System.out :: print);
		System.out.println("...................");
		//intStream2.forEach(System.out :: println);
		

	}

}
