package oct.test5;

public class Two {

	public static void main(String[] args) {
		/*
		 * 外层控制纵向
		 * 内层控制横向
		 */
		for(int x=1;x<=9;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(x+"*"+y+"="+x*y+"\t");
//				System.out.println("");
			}
			System.out.println("");
			
		}
	}

}
