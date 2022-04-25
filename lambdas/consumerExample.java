package java8.lambdas;

import java.util.function.Consumer;

public class consumerExample {

	public static void main(String[] args) {
	
		Consumer<String> c1= (s)-> {System.out.println(s.toUpperCase());};
		//c1.accept("Hello");
		Consumer<String> c2= (s)-> {System.out.println(s.toLowerCase());};
		c1.andThen(c2).accept("java8");
	}

}
