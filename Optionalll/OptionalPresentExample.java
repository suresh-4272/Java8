package java8.Optionalll;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {
		
		Optional<String> ofNullable = Optional.ofNullable("Java8");
		System.out.println(ofNullable.isPresent()?ofNullable.get(): Optional.empty());
		ofNullable.ifPresent(s-> System.out.println(s));

	}

}
