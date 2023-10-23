import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class CannonBallRun {
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
	private static String INPUT_FILE = "dataset/cannonballrun.dat";

	private static void solve(final Scanner in) {
		final int n = in.nextInt();
		for (int tc = 0; tc < n; ++tc) {
			final int c = in.nextInt();
			final int b = in.nextInt();
			int def = 0;
			for (int i = 0; i < c; ++i)
				def += b - in.nextInt(); 
			int cost = in.nextInt();
			int amt = in.nextInt();

			int num_ships = 0;

			if (def <= amt) {
				num_ships = 1;
			}
			else {
				num_ships = def / amt;
				if (def % amt != 0)
					++num_ships;
			}  

			// System.out.println("deficit: " + def);
			// System.out.println(num_ships);
			System.out.println(num_ships * cost);
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