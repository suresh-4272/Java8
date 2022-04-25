package java8;

import java.io.IOException;
import java.util.Comparator;

public class comparatorExample {
	public static void main(String[] args) throws IOException{
		
		Comparator<Integer> c2=(Integer x,Integer y) -> x.compareTo(y);
		System.out.println(" hi  "+c2.compare(15, 15));
	}

}
