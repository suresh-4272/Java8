package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitExample {

	public static void main(String[] args) {

      List<String> names = Arrays.asList("Apple","Pineapple","Banana","Grapes","Orange");
      names.stream()
      .limit(3)
      .collect(Collectors.toList())
      .forEach(System.out ::println);;
      
      List<Integer> intgers = Arrays.asList(1,2,3,4,5,6);
     int sum = intgers.stream()
      .limit(3)
      .reduce(0,(x,y) -> x+y);
      System.out.println(sum);
      
      List<Integer> intgers1 = Arrays.asList(1,2,3,4,5,6);
      int sum1 = intgers1.stream()
       .skip(2)
       .reduce(0,(x,y) -> x+y);
       System.out.println(sum1);
      
      
      
	}

}
