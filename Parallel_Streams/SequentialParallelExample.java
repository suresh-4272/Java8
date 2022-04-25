package java8.Parallel_Streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialParallelExample {
	
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		String str[]= {"1","2","3","4","5","6","7","8","9","10"};
		System.out.println("Sequential.......");
		printstream(Arrays.stream(str).sequential());
		System.out.println("Sequential.......");
		printstream(Arrays.stream(str).parallel());

	}
	static void printstream(Stream<String> stream) {
		 
	stream.forEach(s-> {
		System.out.println(LocalTime.now()+" value "+s+ " - thread : "+Thread.currentThread().getName());
	     try {
	    	 Thread.sleep(200);
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }
	});
	}

}
