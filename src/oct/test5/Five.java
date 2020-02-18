package oct.test5;

public class Five {

	public static void main(String[] args) {
		final int line = 8;
		int count = 0;
		for(int num = 2;num<=10000;num++) {
			while (isPrime(num)) {
				count++;
				if(count%line==0) {
					System.out.printf("%-5s\n",num);
				}else
					System.out.printf("%-5s",num);
				num++;
			}
		}
	
		
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
