package oct.test3;

import java.util.Random;

public class RandomNum {


	public static void main(String[] args) {
		
		Random ran = new Random();
		int x = ran.nextInt(12);
		String[] month = {"Jan","Feb","Marth","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		System.out.println(x+1);
		System.out.println(month[x]);
		
		
	}

}
