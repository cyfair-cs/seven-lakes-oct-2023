import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class Mutiny {
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
	private static String INPUT_FILE = "dataset/mutiny.dat";

	private static void input(final Scanner in) {
		final int n = in.nextInt();
		int m = in.nextInt();
		int[] ap = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n; ++i)
			ap[i] = in.nextInt();
		for (int i = 0; i < n; ++i)
			s[i] = in.nextInt();
		solve(-1, n, m, 0, ap, s);
		System.out.println(max_swords);
	}

	private static int max_swords = 0;

	private static void solve(int last_index, final int pirates, 
		int strength, int swords_count, 
		int[] attack_power, int[] swords) 
	{
		if (last_index != -1) {
			strength -= attack_power[last_index];
			swords_count += swords[last_index];
			attack_power[last_index] = 0;
			swords[last_index] = 0;
		}

		if (strength <= 0) {
			if (swords_count > max_swords)
				max_swords = swords_count;
			return;
		}

		for (int i = 0; i < pirates; ++i) {
			int[] attack_cpy = new int[pirates];
			int[] swords_cpy = new int[pirates];

			for (int x = 0; x < pirates; ++x) {
				attack_cpy[i] = attack_power[i];
				swords_cpy[i] = swords[i];
			}

			solve(i, pirates, strength, swords_count, attack_cpy, swords_cpy);
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

		input(in);
	}
}