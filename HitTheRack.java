import static java.lang.System.*;
import java.util.*;
import java.io.*;

class HitTheRack {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for(int c=0;c<t;c++)
        {
            
            String[] a = s.nextLine().split(" ");
            /*Finds the total minutes of the given time*/
            int time= (Integer.parseInt(a[0].substring(0, a[0].indexOf(":"))) * 60) + (Integer.parseInt(a[0].substring(a[0].indexOf(":") + 1)));
            /*Finds the total minutes of the final time plus 720 minutes because it is in a.m. */
            int wake = (Integer.parseInt(a[1].substring(0, a[1].indexOf(":"))) * 60) + (Integer.parseInt(a[1].substring(a[1].indexOf(":") + 1))) + 720;
           
            /*Checks if the final wake time subtracted from the initial time is greater than 480 minutes or 8 hours*/
            if((wake - time) >= 480){
                System.out.println("getting the ZZZs");
            }
            else{
               System.out.println("gonna take a nap");
            }
        }

    }
}
