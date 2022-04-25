package java8.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingUnboxingEXample {
	
	static List<Integer> boxingMethod(){
		return IntStream.rangeClosed(1, 40).boxed().collect(Collectors.toList());
	//converting to wrapper Integer collect as List
	}
    
	static int calculateSum(List<Integer> list) {
		return list.stream().mapToInt(Integer :: intValue).sum(); //map do the converting part
	}
	
	
	static  double map2Double() {
		return IntStream.rangeClosed(0, 40).mapToDouble(x -> x).sum();
	}
	static  List<Integer> map2Obj() {
		return IntStream.rangeClosed(0, 40).mapToObj(x -> x).collect(Collectors.toList()); //{new Integer(x); }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(boxingMethod());
		System.out.println(calculateSum(boxingMethod()));
		System.out.println(map2Double());
		System.out.println(map2Obj());

	}

}
