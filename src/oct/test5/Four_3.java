package oct.test5;

public class Four_3 {

	public static void main(String[] args) {
		
		for(int x=1;x<=6;x++) {
			for(int y=6;y>0;y--) {
				if(y>x) {
					System.out.print(" ");
				}else {
					System.out.print(y);
				}
			}
			System.out.println("");
		}
		
	}

}
