package oct.test2;

import java.math.BigInteger;
import java.lang.System;
public class Time {
	
	private static long TOTALMIILSECONDS = 0;
	private static long TOTALSECONDS = 0;
	private static long TOTALHOURS = 0;
	private static long TOTALMINUTE = 0;
	private static long HOURS = 0;
	private static long MINUTE = 0;
	private static long SECONDS = 0;
	
	public static void main(String[] args) {
		TOTALMIILSECONDS = System.currentTimeMillis();
		TOTALSECONDS = TOTALMIILSECONDS/1000;
		TOTALMINUTE = TOTALSECONDS/60;
		TOTALHOURS = TOTALMINUTE/60;
		
		SECONDS = TOTALSECONDS%60;
		MINUTE = TOTALMINUTE%60;
		/*
		 * 时区要加8
		 */
		HOURS = (TOTALHOURS%24)+8;
		
		System.out.println(HOURS+":"+MINUTE+":"+SECONDS);
		System.out.println(TOTALHOURS);
//		long a = TOTALHOURS*3600;
//		System.out.println(a);
		System.out.println(TOTALMIILSECONDS);
		
	}

}
