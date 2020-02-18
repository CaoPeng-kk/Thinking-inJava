package oct.test5;

public class Six {

	public static void main(String[] args) {

		/*
		  *   编写程序，显示从101到2100期间所有的闰年，
		  *    每行显示10个。数字之间用一个空格字符隔开，同时显示这期间闰年的数目。
		 */
		int count = 0;
		
		for(int year=101;year<=2100;year++) {
			
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
			if(isLeapYear) {
				count++;
				if(count%10==0) {
					System.out.println(year);
				}else {
					System.out.print(year+" ");
				}
			}
			
		}
		System.out.println("闰年的个数为："+count );
		
	}

}
