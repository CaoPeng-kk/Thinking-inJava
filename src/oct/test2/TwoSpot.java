package oct.test2;

import java.util.Scanner;

public class TwoSpot {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("ÊäÈë×ø±ê");
		
		while(input.hasNext()) {
			double x1=input.nextDouble();
			double y1=input.nextDouble();
			double x2=input.nextDouble();
			double y2=input.nextDouble();
			double sum;
			sum=Math.pow(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)), 0.5);
//			System.out.printf("%.2f\r\n",sum);
			System.out.println(sum);
		}
	
		
	}

}
