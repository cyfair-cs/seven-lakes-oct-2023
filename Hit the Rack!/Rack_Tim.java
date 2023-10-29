// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class sleep {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int lines = io.nextInt(); // read number of test cases
        for (int i = 0; i < lines; i++) { // loop through each test case (from 0 to number of test cases)
            String[] start = io.next().split(":"); // read bed time and split it by the colon (:) to get hours and minutes in an array
            String[] end = io.next().split(":"); // do the same with the wake up time
            int minutes = 720-(Integer.valueOf(start[0])*60+Integer.valueOf(start[1]))+(Integer.valueOf(end[0])*60+Integer.valueOf(end[1])); // how am i supposed to comment this bruh
            // 720 = 24hrs * 60mins, aka the number of minutes in a day
            // we are multipling the hours part of the bedtime by 60 to get the number of minutes, then adding the number of remaining minutes. doing the same for the wakeup time
            // 720 - bedtime minutes give tells us how many minutes before midnight bedtime was
            // add that to the wakeup time minutes
            if (minutes >= 480) // if we slept for more than 480 minutes (8 hours)
            // Integer.valueOf() converts value from the string array into integers for math
                out.println("getting the ZZZs");
            else // if we didn't
                out.println("gonna take a nap");
        }
	}
}