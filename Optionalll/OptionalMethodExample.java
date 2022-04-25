package java8.Optionalll;

import java.util.Optional;

public class OptionalMethodExample {

	public static void main(String[] args) {

		Optional<String> ofNullable = Optional.ofNullable("Java8");
		System.out.println(ofNullable.isPresent()?ofNullable.get(): Optional.empty());
		
		Optional<String> of=Optional.of("Hello");
		System.out.println(of.isPresent()?of.get(): Optional.empty());
		
		
	}

}
