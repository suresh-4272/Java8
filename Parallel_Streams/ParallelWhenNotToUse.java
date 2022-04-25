package java8.Parallel_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelWhenNotToUse {

	public static void main(String[] args) {

	List<Integer> list =	IntStream.rangeClosed(0, 100000).boxed().collect(Collectors.toList());
	sequentialCalculations(list);
	parallelCalculations(list);
	}
	
	static int sequentialCalculations(List<Integer> list) {
		long start= System.currentTimeMillis();
		int total = list.stream()
				.reduce(0, (x,y)-> x+y);
		long end= System.currentTimeMillis();
		System.out.println("seq Duration : "+(end-start));
		return total;
	}
	static int parallelCalculations(List<Integer> list) {
		long start= System.currentTimeMillis();
		int total = list.parallelStream()
				.reduce(0, (x,y)-> x+y);
		long end= System.currentTimeMillis();
		System.out.println("par Duration : "+(end-start));
		return total;
	}


}
