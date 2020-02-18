package oct.test1;

import java.text.DecimalFormat;

public class Demo extends Demo_2 {
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(5));
		
	}
	public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) {
	        return false; 
	      }
	    }
	    return true; 
	}
}


