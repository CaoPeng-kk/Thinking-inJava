package oct.test2;

import java.util.Scanner;

public class Lenth {

	public static void main(String[] args) {
		int length = 0;
		Scanner input = new Scanner(System.in);
		System.out.println(" ‰»Î±ﬂ≥§");
		if(input.hasNext()) {
			length = input.nextInt();
		}
		float hex = area(length);
		System.out.println(hex);
		
	}

	private static float area(int length) {
		float hexagonArea = 0f;
		hexagonArea =  (float)((3*(Math.pow(3, 0.5)))/2*length*length);
		
		return hexagonArea;
	}
	
}
