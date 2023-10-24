// tim; works with given test cases but judged wrong
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class cipher {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(new File("cipher.txt"));
        int cases = io.nextInt();
        io.nextLine();
        for (int i = 0; i < cases; i++){
            String line = io.nextLine();
            int shift = Integer.valueOf(line.substring(0, line.indexOf(" ")));
            String text = line.substring(line.indexOf(" ")+1, line.length());
            String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String result = "";
            for (int j = 0; j < text.length(); j++) {
                String character = text.substring(j, j+1);
                int pos = alpha.indexOf(character.toUpperCase());
                if (alpha.contains(character.toUpperCase())) {
                    while (shift > 25 - pos)
                        shift = (shift-26);
                        //out.println("e"+shift);
                    while (shift < 0 && Math.abs(shift) > pos)
                        shift = 26 - Math.abs(shift)-pos;
                }
                //out.println("shift"+shift);
                //out.println("pos"+pos);
                //out.println("chat"+character);
                //out.println("result"+(character.equals(" ") ? " " : alpha.charAt(pos+shift)));
                result += !alpha.contains(character.toUpperCase()) ? character.toUpperCase() : alpha.charAt(pos+shift);
                
            }
            out.println(result);
        }
	}
}