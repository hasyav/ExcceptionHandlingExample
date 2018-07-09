package io.javabrains;

import java.util.function.BiConsumer;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int[] someNumbers = {2,4,6,8};
		
		int key = 0;
		
//		We write a try catch block here because we dont know that the BiConsumer<Integer,Integer> returns
		
//		We can also use wrapper lamdas to handle exceptions 
		
		process(someNumbers,key,(v,k)->{
			try {
				System.out.println(v/k);
			}
			catch(ArithmeticException e) {
				System.out.println("An exception happend");
			}
		});
	}
	
	
//BiConsumer<Integer,Integer> - this is a generic interface provided by java - we can use this to write lamda expressions
//	Function interface
	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer>consumer) {
		
		for(int i:someNumbers) {
		
				consumer.accept(i, key);
				
			
	}

}
}