import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class cannon {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
     //testcases
    int tc = scan.nextInt();scan.nextLine();
        for (int i = 0;i<tc;i++){
            int c = scan.nextInt();
            int capacity = scan.nextInt() * c; // if there's 5 cannons and each have a capacity of 6, you cana have a total of 30 cannonballs
            scan.nextLine();
            int count = 0;
            String[] arr= scan.nextLine().split(" ");
            //add up the total number of cannons currently in
            for (int x=0;x<arr.length;x++){
                count+=Integer.parseInt(arr[x]);
            }
            //subtract the amount actually needed
            int needed = capacity -count;
            //result variable
            int constant = 0;
            int cost = scan.nextInt();
            int bulk = scan.nextInt();
            //simple dividing loop to determine how many packs are needed
            while (needed>0){
                needed-=bulk;
                constant++;
            }
            out.println(cost*constant + " coins");
        }
    }
}