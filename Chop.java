import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class Chop {
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
	private static String INPUT_FILE = "dataset/Chop.dat";

	private static void solve(final Scanner in) {
		// Test Cases
		int t = in.nextInt();
		for (int e = 0; e < t; ++e) {
			
			// The array 'w' represents our set of waves
			int[] w = new int[in.nextInt()];
			for (int i = 0; i < w.length; ++i)
				w[i] = in.nextInt();

			/*
			 * Then we just loop through, and count how
			 * many waves are greater than the wave
			 * before it and after it.
			 */
			int count = 0;
			for (int i = 1; i < w.length-1; ++i)
				if (w[i] > w[i-1] && w[i] > w[i+1])
					++count;
			System.out.println(count);
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