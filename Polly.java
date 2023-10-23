import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class Polly {
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
	private static String INPUT_FILE = "dataset/polly.dat";

	private static void solve(final Scanner in) {
		int n = in.nextInt();
		in.nextLine();
		for (int x = 0; x < n; ++x) {
			String line = in.nextLine();

			/*
			 * We just loop over and over, growing our
			 * phrase until removing all occurences of
			 * it causes the string to be completely
			 * empty.
			 */
			String phrase = line.charAt(0) + "";
			for (int i = 1; i < line.length(); ++i) {
				if (line.replaceAll(phrase, "").equals(""))
					break;
				phrase = phrase + line.charAt(i);
			}
			System.out.println(phrase);
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