package oct.test3;

import java.util.Calendar;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		/*
		 * ������ �� ��  ��ʾΪ���ڼ�
		 */
		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			int years = input.nextInt();
			int month = input.nextInt();
			int days = input.nextInt();
			
			/*
			 * ��ʽ
			 */
			int h = ((days-1+((26*(month+1))/10)+(years%100)+((years%100)/4)+(years/4)+(5*(years/4)) ))%7;
			System.out.println(h);
		}
		
	}

}
