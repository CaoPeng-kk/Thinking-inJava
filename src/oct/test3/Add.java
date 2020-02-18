package oct.test3;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int numberOne = (int) (System.currentTimeMillis()%10);
		int numberTwo = (int) (System.currentTimeMillis()/10%10);
		int sum = numberOne+numberTwo;
		System.out.println(numberOne+"+"+numberTwo+"="+"?");
		Scanner input = new Scanner(System.in);
		
		if(input.hasNext()) {
			int stu = input.nextInt();
			if(stu==sum) {
				System.out.println("ÕıÈ·");
			}else {
				System.out.println("´íÎó");
			}
		}
		
		
		
	}

}
