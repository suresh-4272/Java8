package java8;
@FunctionalInterface
public interface funcInterface {

		
			public void add();
			
			default String say() {
				return "HI";
			}
			static String say2() {
				return "BYE";
			}


}
