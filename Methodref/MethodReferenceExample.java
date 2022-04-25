package java8.Methodref;

import java.util.Comparator;

public class MethodReferenceExample {

	
	//MethodReference Syntax:  Classname :: methodName
	public static void main(String[] args) {
		
		System.out.println(MethodReferenceExample.compare(20, 30));
		Comparator<Integer> comp = MethodReferenceExample::compare;
		System.out.println("Result 2: "+comp.compare(20,30));

	}
	
	public static int compare(Integer x,Integer y) {
		return Integer.compare(x, y);
	}

}
