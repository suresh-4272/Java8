package java8.Parallel_Streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialParallelExample1 {

	public static void main(String[] args) {
	
		//System.out.println("SUm Seq :"+sumMethodUsingSeq());
		//System.out.println("Sum Par : "+sumMethodUsingPar());
		System.out.println("SUm Seq :"+checkPerformance(SequentialParallelExample1 :: sumMethodUsingSeq,25));
		System.out.println("SUm Par :"+checkPerformance(SequentialParallelExample1 :: sumMethodUsingPar,25));
	}
	static long checkPerformance(Supplier<Integer> sum,int numOfTimes) {
		long start = System.currentTimeMillis();
		for(int i=0;i<numOfTimes;i++) {
			sum.get();
		}
		long end=System.currentTimeMillis();
		return end-start;
	}
	
	static int sumMethodUsingSeq() {
		return IntStream.rangeClosed(0, 10000000).sum();
		
	}
	static int sumMethodUsingPar() {
		return IntStream.rangeClosed(0, 10000000).parallel().sum();
		
	}
}
