package oct.test5;

import java.text.DecimalFormat;

public class Three {

	public static void main(String[] args) {
		
			System.out.println("ǧ��"+"\t"+"��"+"\t"+"Ӣ��"+"\t"+"ǧ��"+"\t");
			DecimalFormat r = new DecimalFormat("#.##");
			for(int i = 1;i<=199;i++) {
				System.out.println(i+"\t"+r.format(2.2*i)+"\t"+i+"\t"+r.format(1.609*i));
			}
		}

		
	}
	

