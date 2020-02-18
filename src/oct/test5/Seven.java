package oct.test5;

public class Seven {

	public static void main(String[] args) {
		/*
		 * 7、	编写程序，计算下面的和：
		 * 1/(1+√2)+1/(√2+√3)+1/(√3+√4)+⋯+1/(√624+√625)
		 */
		double sum = 0d;
		for(int i=1;i<=624;i++) {
			sum += 1.0/(Math.pow(i, 0.5)+Math.pow(i+1, 0.5));
			
		}
		System.out.println("总和："+sum);
		
	}

}
