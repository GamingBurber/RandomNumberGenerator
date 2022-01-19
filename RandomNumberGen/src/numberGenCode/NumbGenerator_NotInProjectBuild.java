package numberGenCode;

import java.util.Random;

public class NumbGenerator_NotInProjectBuild {

	public static void main(String args[]) {
		Random rand = new Random(); //Instance of random class
		int upperbound = 1001;
			//Generate Random Value Between 0 and 2147483647
		int int_random = rand.nextInt(upperbound);
		
	      System.out.println("Random number between 0 and " + (upperbound-1) + " : "+ int_random);
	}
	
}
