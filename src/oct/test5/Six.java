package oct.test5;

public class Six {

	public static void main(String[] args) {

		/*
		  *   ��д������ʾ��101��2100�ڼ����е����꣬
		  *    ÿ����ʾ10��������֮����һ���ո��ַ�������ͬʱ��ʾ���ڼ��������Ŀ��
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
		System.out.println("����ĸ���Ϊ��"+count );
		
	}

}
