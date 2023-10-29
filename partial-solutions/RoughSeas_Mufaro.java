import java.util.*;
import java.io.*;

/*
 * Author: Mufaro Machaya
 */

public class RoughSeas {
	/*
	 * Edit this to switch between file input
	 * and Standard Input
	 *
	 * Keep it on FALSE for testing (File Input)
	 * Keep it TRUE for the final submission (Standard Input)
	 */
	private static final boolean SUBMIT = false;

	/*
	 * All input files are located at 'dataset/'
	 */
	private static String INPUT_FILE = "dataset/roughseas.dat";

	private static void input(final Scanner in) {
		int tests = in.nextInt();
		for (int i = 0; i < tests; ++i) {
			double[] a = { in.nextDouble(), in.nextDouble() };
			double[] b = { in.nextDouble(), in.nextDouble() };
			double calm_speed = in.nextDouble();
			double rough_speed = in.nextDouble();
			solve(a, b, calm_speed, rough_speed);
		}
	}

	private static double distance(double[] a, double[] b) {
		return Math.sqrt( Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2) );
	}

	private static void solve(double[] a, double[] b, double calm_speed, double rough_speed) {
		double slope = (b[1] - a[1]) / (b[0] - a[0]);
		double x_cross = ( slope * a[0] - a[1] ) / slope;
		double[] intercept = new double[] { x_cross, 0 };
		double calm_distance = distance(a, intercept);
		double rough_distance = distance(intercept, b);
		System.out.printf("%.03f\n", calm_distance / calm_speed + rough_distance / rough_speed);
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