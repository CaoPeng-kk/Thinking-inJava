package oct.test2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		int temPerature = 0;
		float faH = 0.0f;
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt()) {
			temPerature = input.nextInt();
			
		}
		faH = (float) ((9.0/5.0)*(temPerature)+32);
		System.out.println(faH);
		
	}

}
