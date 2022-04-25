package java8.Methodref;

import java.util.function.Consumer;

public class LambdaLocalVariable {
	
	//String x= "Hello";  #instance var
	static int k=0;

	public static void main(String[] args) {
		
		int i=10;   //local Variable
		
		Consumer<Integer> c1= (j) ->{
//			i++;
			k=30;
			System.out.println(k);
			System.out.println(i+j);
	};
	c1.accept(15);
	}

}
