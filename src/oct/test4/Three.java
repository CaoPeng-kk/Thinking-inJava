package oct.test4;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			int n = input.nextInt();
			int s = input.nextInt();
			
			float area = (float) ((n*s*s)/(4*(Math.tan(3.14/n))));
			System.out.println(area);
		}
		
		
	}

}
