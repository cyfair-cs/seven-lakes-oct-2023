import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class HitTheRack {
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
	private static String INPUT_FILE = "dataset/Hit the Rack.txt";

	/*
	 * We parse each time to a double (in hours)
	 */
	private static double parse_time(String in) {
		int[] tokens = Arrays.stream(in.split(":")).mapToInt(Integer::parseInt).toArray();
		return tokens[0] + tokens[1] / 60.0; 
	}

	private static void solve(final Scanner in) {
		int n = in.nextInt();
		in.nextLine();
		for (int t = 0; t < n; ++t) {
			String[] input = in.nextLine().split(" ");
			double sleep = parse_time(input[0]), 
				wake = parse_time(input[1]);
			/*
			 * We have to add 0.0001 to tip doubles over to 
			 * the next whole number. (7.99999 -> 8.00001 or 
			 * similar) 
			 */
			System.out.println(wake + 12 - sleep + 0.0001 >= 8 ? "getting the ZZZs" : "gonna take a nap");
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