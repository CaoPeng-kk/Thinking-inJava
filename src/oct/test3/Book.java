package oct.test3;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		if(input.hasNext()) {
			String s = input.next();
			int sum = 0;
			for(int i=0;i<s.length();i++) {
				
				int nums = s.charAt(i);
			
				if(i%2==0) {
					sum +=((nums-48)*1);
				}else  if(i%2==1){
					sum +=((nums-48)*3);
				}
//				System.out.println(nums);
			}
			System.out.println(sum);
			int mod = sum%10;
			int N = 10-mod;
			if(N==10) {
				N=0;
				
			}
			System.out.println(s+N);
			}
			
			
		}
			
			
		}
		


