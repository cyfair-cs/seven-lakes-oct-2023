import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class Message {
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
	private static String INPUT_FILE = "dataset/message.dat";

	private static String erase_characters(String message) {
		while (message.contains("#"))
			for (int i = 0; i < message.length(); ++i)
				if (message.charAt(i) == '#') {
					message = message.substring(0, i-1) + message.substring(i+1);
					--i;
				}
		return message;
	}

	private static double convert_to_pwpm(final String key, final String line, final int seconds) {
		char[] key_arr = key.toCharArray(),
			line_arr = line.toCharArray();

		int correct_characters = 0;
		for (int i = 0; i < Math.min(key_arr.length, line_arr.length); ++i)
			if (key_arr[i] == line_arr[i])
				++correct_characters;

		return correct_characters / 5.0f / (seconds / 60.0f);
	}

	private static void solve(final Scanner in) {
		final String key = in.nextLine();
		final int n = in.nextInt();
		in.nextLine();

		double max = 0; 
		for (int i = 0; i < n; ++i) {
			double pwpm = convert_to_pwpm(key, erase_characters(in.nextLine()), in.nextInt());
			if (in.hasNextLine())
				in.nextLine();

			System.out.printf("%.02f\n", pwpm);

			if (pwpm > max)
				max = pwpm;
		}

		System.out.printf("The highest pirate words per minute is %.02f\n", max);
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