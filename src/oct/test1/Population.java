package oct.test1;

import java.math.*;

public class Population {

	private static final int POPULATION = 312032486;
	private static final int SECOND_A_YEAR = 60*60*24*365;
	
	public static void main(String[] args) {

		int add = addPopulation(SECOND_A_YEAR);
		int lose = losePopulation(SECOND_A_YEAR);
		int come = comePopulation(SECOND_A_YEAR);
		
		int one_year = POPULATION+add-lose+come;
		int two_year = POPULATION+(2*add)-(2*lose)+(2*come);
		int three_year = POPULATION+(3*add)-(3*lose)+(3*come);
		int four_year = POPULATION+(4*add)-(4*lose)+(4*come);
		int five_year = POPULATION+(5*add)-(5*lose)+(5*come);
		System.out.println(one_year+","+two_year+","+three_year+","+four_year+","+five_year);
		
	}
	private static int addPopulation(int second) {
		int people = second/7;
		
		return people ;
	}
	
	private static int losePopulation(int second) {
		int dead = second/13;
		
		return dead;
	}
	
	private static int comePopulation(int second) {
		int come = second/45;
		
		return come;
	}
	
	
}
