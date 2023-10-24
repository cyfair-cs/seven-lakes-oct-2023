// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class morale {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int lines = io.nextInt(); // read the number of test cases

        for (int i = 0; i < lines; i++) { // loop through test cases (from 0 to number of test cases)
            double wealth = io.nextDouble(); // read wealth
            double crew = io.nextDouble(); // read number of crewmembers
            double leader = io.nextDouble(); // read leader quality
            out.printf("%.2f\n",(wealth*wealth)/Math.sqrt(crew)+leader); // do the formula and round to 2 decimal points using printf. "%.2f" means 2 digits after decimal point and the \n moves to new line for next test case
        }
	}
}