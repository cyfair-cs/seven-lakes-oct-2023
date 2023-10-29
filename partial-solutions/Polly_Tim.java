// serge
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class cracker {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int cases = io.nextInt();
        int i = 0;
        while(i < cases)
        {
            String word = "";
            String test = io.nextLine();
            for(int j = 0; j < test.length(); j++)
            {
                Set<String> set = new Set<String>();
                if(set.add(test.substring(j, j+1)))
                {
                    word += "" + test.substring(i, i+1);
                }
                out.println(word);
                i++;
            }
        }

        
	}
}