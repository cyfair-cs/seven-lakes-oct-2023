import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class ShipBuilding {
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
	private static String INPUT_FILE = "dataset/ShipBuilding.dat";

	private static void solve(final Scanner in) {
		// Test Cases
		final int tc = in.nextInt();
		for (int i = 0; i < tc; ++i) {

			// Our minimum strength
			int min = in.nextInt();

			// The strength values
			int[] v = new int[3];
			for (int j = 0; j < 3; ++j) {
				int next = in.nextInt();

				/* 
				 * If it is less than our minimum, 
				 * we set it to infinity.
				 */
				v[j] = next > min ? next : Integer.MAX_VALUE;
			}


			// Then we get the index of the minimum
			int si = 0;
			for (int j = 1; j < 3; ++j)
				if (v[j] < v[si])
					si = j;

			// Print according to our index
			String[] mats = new String[] { "Plastic", "Wood", "Metal" };
			System.out.println(mats[si]);
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