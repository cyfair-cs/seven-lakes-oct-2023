import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class PirateJimmy {
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
	private static String INPUT_FILE = "dataset/The Pirate Jimmy.txt";

	private static void solve(final Scanner in) {
		System.out.println(in.nextLine().toLowerCase().equals("gold coin") ? "yes" : "no");
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