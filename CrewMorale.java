import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class CrewMorale {
	/*
	 * Edit this to switch between file file input
	 * and Standard Input
	 *
	 * Keep it on FALSE for testing (File Input)
	 * Keep it TRUE for the final submission (Standard Input)
	 */
	private static final boolean SUBMIT = true;

	/*
	 * All input files are located at 'dataset/'
	 */
	private static String INPUT_FILE = "dataset/Crew Morale.txt";

	private static void solve(final Scanner in) {
		final int lines = in.nextInt();
		for (int i = 0; i < lines; ++i) {
			double[] vals = new double[] {
				in.nextDouble(),
				in.nextDouble(),
				in.nextDouble()
			};
			System.out.printf("%.02f\n", Math.pow(vals[0], 2) / Math.sqrt(vals[1]) + vals[2] );
		}
	}

 	/*
 	 * Do not edit this method!
 	 */
	public static void main(String[] args) throws IOException {
		Scanner in = null;
		if (SUBMIT)
			in = new Scanner(System.in);
		else
			in = new Scanner(new File(INPUT_FILE));

		solve(in);
	}
}