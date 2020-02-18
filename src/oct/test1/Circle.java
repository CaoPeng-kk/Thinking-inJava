package oct.test1;

public class Circle {
	
	private static final double PI = 3.14;
	private static final double R = 5.5;

	public static void main(String[] args) {
		double perimeter = periMeter(PI, R);
		double area = area(PI, R);
		System.out.println(perimeter);
		System.out.println(area);
		
	}
	
	private static double periMeter(double Pi,double R) {
		
		return (2*Pi*R);
		
	}
	
	private static double area(double Pi,double R) {
		
		return (Pi*R*R);
		
	}

}
