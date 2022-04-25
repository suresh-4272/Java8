package java8.Parallel_Streams;

import java.util.stream.IntStream;

public class ParallelWhenNotToUseExample1 {

	public static void main(String[] args) {
		
    Calculations cal = new Calculations();
    
    IntStream.rangeClosed(0, 2000).forEach(cal :: Calculate);
    System.out.println(cal.getTotal());
    
    IntStream.rangeClosed(0, 2000).parallel().forEach(cal :: Calculate);
    System.out.println(cal.getTotal());
	}
}


class Calculations{
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void Calculate(int in) {
		
		total += in;
	}
	
}