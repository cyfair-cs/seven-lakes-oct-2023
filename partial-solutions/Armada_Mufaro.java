import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class Armada {
	/*
	 * Edit this to switch between file file input
	 * and Standard Input
	 *
	 * Keep it on FALSE for testing (File Input)
	 * Keep it TRUE for the final submission (Standard Input)
	 */
	private static final boolean SUBMIT = false;

	/*
	 * All input files are located at 'dataset/'
	 */
	private static String INPUT_FILE = "dataset/armada.dat";

	private static void solve(final Scanner in) {
		int n = in.nextInt();
		for (int t = 0; t < n; ++t) {
			int s = in.nextInt();
			char[] phrase = in.nextLine().toUpperCase().trim().toCharArray();
			for (int i = 0; i < phrase.length; ++i)
				if (Character.isLetter(phrase[i])) {
					phrase[i] += s;
					if (!Character.isLetter(phrase[i]))
						phrase[i] = s > 0 ? 'Z' : 'a';
				}
			System.out.println(new String(phrase).toUpperCase());
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