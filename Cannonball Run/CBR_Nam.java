import static java.lang.System.*;
import java.util.*;
import java.io.*;

class CannonballRun_Nam {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for(int i = 0;i < t;i++){
            int totalAmmo = s.nextInt() * s.nextInt();
            s.nextLine();
            int boxTotal = 0;
            String[] box = s.nextLine().split(" ");
            for(int v = 0; v < box.length;v++){
                boxTotal += Integer.parseInt(box[v]);
            }
            int cost = s.nextInt();
            int amount = s.nextInt();

            int neededAmmo = totalAmmo - boxTotal;

            int totalCost = 0;
            while(neededAmmo > 0){
                totalCost += cost;
                neededAmmo -= amount;
            }
            System.out.println(totalCost + " coins");
        }
    }
}
