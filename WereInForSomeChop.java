import static java.lang.System.*;
import java.util.*;
import java.io.*;

class WereInForSomeChop {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i < t;i++){
            int a = s.nextInt();
            s.nextLine();
            String[] v = s.nextLine().split(" ");

            int count = 0;

            for(int h = 1; h < a - 1; h++){
                if((Integer.parseInt(v[h]) > Integer.parseInt(v[h - 1])) && (Integer.parseInt(v[h]) > Integer.parseInt(v[h + 1]))){
                    count++;
                }
            }
            System.out.println(count);
         }
    }
}