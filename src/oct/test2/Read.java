package oct.test2;

import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		
		int integer = 0;
		int units = 0;
		int extract = 0;
		int decade = 0;
		int hundred = 0;
		
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt()) {
			
				integer = input.nextInt();
				/*
				 * 范围判断
				 */
//				if(input.nextInt()<1||input.nextInt()>=1000) {
//					System.out.println("重新输入");
//				}
				/*
				 * 如果分割之后的数大于10 ，再次进行取余 ,并进行分割
				 */
				units = integer%10;
				extract = integer/10;
				if(extract>10) {
					decade = extract%10;
					hundred = extract/10;
			}
			int sum = units+decade+hundred;
			System.out.println(hundred+","+decade+","+units+","+sum);
		}
	}

}
