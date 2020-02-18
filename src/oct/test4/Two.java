package oct.test4;

import java.util.Scanner;

import oct.test4.*;
public class Two {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();
			double m1 = Math.toRadians(x1);
			double n1 =	Math.toRadians(y1);
			double m2 =	Math.toRadians(x2);
			double n2 =	Math.toRadians(y2);
			double m3 =	Math.toRadians(x3);
			double n3 =	Math.toRadians(y3);
			double m4 =	Math.toRadians(x4);
			double n4 =	Math.toRadians(y4);
			
			double a = length(m1, n1, m2, n2);
			double b = length(m2, n2, m3, n3);
			double c = length(m1, n1, m3, n3);
			double d = length(m2, n2, m4, n4);
			double e = length(m3, n3, m4, n4);
			
			double pic1 = (a+b+c)/2;
			double pic2 = (b+d+e)/2;
			
			double area1 = Math.pow(pic1*(pic1-a)*(pic1-b)*(pic1-c),0.5);
			double area2 = Math.pow(pic2*(pic2-b)*(pic2-d)*(pic2-e),0.5);
			
			double sum = area1+area2;
			System.out.println(sum);
		}
		
		
		
	}
	public static double length(double a,double b,double c,double d) {
		/*
		 * º∆À„≥§∂»
		 */
		double earth = 6371.01f;
		double len = (double)earth*Math.acos((Math.sin(a)*Math.sin(c))+(Math.cos(a)*Math.cos(c)*Math.cos(b-d)));
		return len;
	}

}
