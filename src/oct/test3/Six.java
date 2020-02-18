package oct.test3;

import java.awt.Rectangle;
import java.util.Random;

public class Six {

	public static void main(String[] args) {

//		Rectangle re = new Rectangle(-50,100,100,200);
		Random ran = new Random();
		double a = ran.nextDouble()*100-50;
		double b = ran.nextDouble()*200-100;
		System.out.println(a+","+b);

		
		
	}

}
