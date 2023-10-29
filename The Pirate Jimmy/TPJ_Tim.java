// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class pirateJimmy {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        String input = io.nextLine(); // read input text
        if (input.equalsIgnoreCase("gold coin")) // does it equal "gold coin"? (ignoring capital/lower case)
            out.println("yes");
        else // it doesn't?
            out.println("no");
	}
}