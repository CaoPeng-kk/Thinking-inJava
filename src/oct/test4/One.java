package oct.test4;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double X1 = Math.toRadians(x1);
			double Y1 = Math.toRadians(y1);
			double X2=  Math.toRadians(x2);
			double Y2 = Math.toRadians(y2);
			float earth = 6371.01f;
			double d = (double)earth*Math.acos((Math.sin(X1)*Math.sin(X2))+(Math.cos(X1)*Math.cos(X2)*Math.cos(Y1-Y2))) ;
			System.out.println(d);
		}
		
		
		
	}

}
