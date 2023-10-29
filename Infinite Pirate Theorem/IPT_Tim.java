// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class InfinitePirateTheorem_Tim {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int lines = io.nextInt(); // read number of test cases
        String input = ""; // create input variable to be assigned later
        io.nextLine(); // move scanner cursor to next line

        for (int i = 0; i < lines; i++) { // loop through test cases (from 0 to number of test cases)
            input = io.nextLine(); // read current test case
            h(input); // call the h method. named h because it's faster to type than a fancy name, which is important in competitions
        }
	}
    static void h(String input) {
        String chars = "argh matey"; // all lowercase letters in "argh matey"
        String charsCap = "ARGH MATEY"; // since capital letter doesn't equal it's lowercase counterpart, we make a capital one too
        for (int i = 0; i < input.length(); i++) { // loop through each character in the input
            if (!chars.contains(input.substring(i, i+1)) && !charsCap.contains(input.substring(i, i+1))) { // if the current letter is NEITHER in the lowercase NOR in the capital variables above
                out.println("No");
                return; // stop method here if a character isn't in argh matey
            }
        }
        out.println("Yes"); // if it hasn't been stopped by the return above, it must be valid, therefore print yes
    }
}