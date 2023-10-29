import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class InfinitePirateTheorem_Mufaro {
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
	private static String INPUT_FILE = "dataset/Infinite Pirate Theorem.txt";

	private static void solve(final Scanner in) {
		int lines = in.nextInt();
		in.nextLine();

		final String key = "argh matey".toUpperCase();

		for (int i = 0; i < lines; ++i) {
			char[] chars = in.nextLine().toUpperCase().toCharArray();
			ArrayList<Character> nons = new ArrayList<Character>();
			for (Character c: chars)
				if (!key.contains(c + "") && !nons.contains(c))
					nons.add(c);

			// System.out.println(nons);
			System.out.println(nons.isEmpty() ? "Yes" : "No");
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