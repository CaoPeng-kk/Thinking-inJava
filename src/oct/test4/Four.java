package oct.test4;

import java.util.Random;
import java.util.Scanner;
import oct.test4.*;

public class Four {

	public static void main(String[] args) {
		
		Random ran = new Random();
		double pi = Math.PI;
		
		double x = ran.nextDouble()*pi*2;
		double y = ran.nextDouble()*pi*2;
		double z = ran.nextDouble()*pi*2;
		
		double x1 = 40*Math.cos(x);
		double y1 = 40*Math.sin(x);
		double x2 = 40*Math.cos(y);
		double y2 = 40*Math.sin(y);
		double x3 = 40*Math.cos(z);
		double y3 = 40*Math.sin(z);
		
//		
//		double a = Two.lenth(x1, y1, x2, y2);
//		double b = Two.lenth(x1, y1, x3, y3);
//		double c = Two.lenth(x2, y2, x3, y3);
		/*
		 * α=arccos⁡((a*a-b*b-c*c)/(-2*b*c))
		 */
//		System.out.println(a);
		/*
		 * 角度值
		 */
		double a = Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
		double b = Math.pow((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1), 0.5);
		double c = Math.pow((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2), 0.5);
		
		double one = Math.acos((a*a-b*b-c*c)/(-2*b*c));
		double two = Math.acos((b*b-a*a-c*c)/(-2*a*c));
		double three = Math.acos((c*c-a*a-b*b)/(-2*a*b));
		
		System.out.println(one+","+two+","+three);
		
		
		
		}
		
		
	}


