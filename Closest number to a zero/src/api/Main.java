package api;

import java.util.Arrays;
import  static java.lang.Math.abs;


public class Main {

	public static void main(String[] args) {
		
		int[] toto = getAnumbers();
		
	Arrays.stream(toto).filter(a -> a !=0)
	.reduce((a, b)-> abs(a) > abs(b)? b : abs(a) == abs(b)? Math.min(a, b) : a)
	.ifPresent(System.out::println);
		System.out.println("Mazda1");
		System.out.println("micra");

		System.out.println("Tolik");
	}

	private static int[] getAnumbers() {
		
		 int arr[] = {3, 2, -8, 5,-2, 4}; 
		 return arr;
		
	}

}
