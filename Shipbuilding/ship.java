// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class ship {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int lines = io.nextInt(); // read how many test cases there are
        for (int i = 0; i < lines; i++) { // loop through all test cases (from 0 up to number of test cases)
            int needed = io.nextInt(); // read strength needed for the ship
            int plastic = io.nextInt(); // read strength of plastic
            int wood = io.nextInt(); // read strength of wood
            int metal = io.nextInt(); // read strength of metal (not really necessary since we're just checking if the other two are enough)
            if (plastic >= needed) { // is plastic is as strong or stronger than what's needed?
                out.println("Plastic");
            }
            else if (wood >= needed) { // if plastic isn't, is wood?
                out.println("Wood");
            }
            else // neither plastic nor wood are, so metal must be
                out.println("Metal");
        }
	}
}