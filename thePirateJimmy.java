import static java.lang.System.*;
import java.util.*;
import java.io.*;

class thePirateJimmy {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine().toLowerCase();
        s.nextLine();
        if(a.equalsIgnoreCase("gold coin")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
