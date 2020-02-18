package oct.test2;

import java.util.Scanner;

public class Money {

	private static int money = 0;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("ÊäÈë´æÇ®½ğ¶î");
		if(input.hasNextInt()) {
			money = input.nextInt();
			
		}
		float add = addMoney(money);
		System.out.println(add);
		
		
	}

	private static float addMoney(int mon) {
		float sumMoney = 0;
		sumMoney = (float) (mon*(1+0.00417));
		for(int i=2;i<=6;i++) {
			sumMoney = (float) ((sumMoney+mon)*(1+0.00417));
		}
		return sumMoney;
	}

}
