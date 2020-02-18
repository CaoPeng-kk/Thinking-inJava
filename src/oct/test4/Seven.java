package oct.test4;

public class Seven {

	public static void main(String[] args) {
		String[] out = new String[3];
		for(int i=0;i<3;i++) {
			String[] str = new String[3] ; 
			char c  = (char)(Math.random() * 26+'a');
			String up = String.valueOf(c);
			
			str[i] = up.toUpperCase();
			out[i] = str[i];
			
		}
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		int c = (int) (Math.random()*10);
		int d = (int) (Math.random()*10);
		
		System.out.println(out[0]+out[1]+out[2]+a+b+c+d);
		
	}

}
