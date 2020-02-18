package oct.test2;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			int money = input.nextInt();
			float accrual = input.nextFloat();
			int year = input.nextInt();
			
			
			float futureMoney = (float) (money*(Math.pow((1+(accrual/12)), (year*12))));
			System.out.println(futureMoney);
		}
		
		
	}

}
