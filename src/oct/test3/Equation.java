package oct.test3;

import java.util.Scanner;
import java.math.*;

public class Equation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a,b,c = 0;
		if(input.hasNext()) {
			/*
			 * ���� a b c 
			 */
			 a = input.nextInt();
			 b = input.nextInt();
			 c = input.nextInt();
			 double root =  (double)(b*b)-(4*a*c);
			 double x,y;
			 if(root==0) {
				 System.out.println("������ȫƽ��");
				 x=y=-b/2*a;
				 System.out.println(x);
			 }else if(root<0) {
				 System.out.println("��Ч��");
			 }else {
				 double g = Math.sqrt(Math.abs(b));
				 x=(-b+Math.pow(root, 0.5))/2*a;
				 y=(-b-Math.pow(root, 0.5))/2*a;
				 System.out.println("��һ������"+x);
				 System.out.println("�ڶ�������"+y);
				 
			 }
		}
				
		
	}

}
