package java8;

import java.util.stream.IntStream;

public class incr_num {
	public static void main(String[] args) {
		
		int total=0;	
		for(int i=0;i<=50;i++) {
			total += i;
		}
		System.out.println("Total num. is : "+total);
		
	
	int total1= IntStream.rangeClosed(0, 50)
			.map(Integer :: new)
			.sum();
    System.out.println(total1);
	}

}
