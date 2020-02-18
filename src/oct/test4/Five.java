package oct.test4;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			
			int a = input.nextInt();
			if(a>127||a<0) {
				System.out.println("ÖØÐÂÊäÈë");
			}
			
			char s = (char) a;
			System.out.println(s);
		}
		
		
	}

}
