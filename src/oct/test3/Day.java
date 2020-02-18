package oct.test3;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] week = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
		if(input.hasNext()) {
			int num = input.nextInt();
			
			if(input.hasNext()) {
				int num2 = input.nextInt();
				System.out.println(week[(num+num2)%7]);
			}
			
		}
		
		
		
	}

}
