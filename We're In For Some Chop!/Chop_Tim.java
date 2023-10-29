// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class chop {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int cases = io.nextInt(); // read number of test cases
        
        for (int i = 0; i < cases; i++) { // loop through test cases (from 0 to number of test cases)
            int peaks = 0; // create peaks variable for current test case
            int n = io.nextInt(); // read number of sea height datapoints that will be given
            io.nextLine(); // move scanner cursor to next line
            String[] pts = io.nextLine().split(" "); // read entire line with datapoints, split it by spaces to each datapoint is put into an element of the array
            for (int j = 1; j < n-1; j++) { // loop through array. we are starting at the second datapoint and ending before the last one for reasons mensioned in the problem instructions
                if (Integer.valueOf(pts[j]) > Integer.valueOf(pts[j-1]) && Integer.valueOf(pts[j]) > Integer.valueOf(pts[j+1])) {  // if the current datapoint (converted from string to integer) is BOTH higher than the previous AND next one
                    peaks++; // add 1 to the peaks counter
                }
            }
            out.println(peaks);
        }
	}
}