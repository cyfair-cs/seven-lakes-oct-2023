/*
 * Written by Tim
 */

package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class CannonBallRun_Tim {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(new File("dataset/Cannonball Run.txt"));
        int tcs = io.nextInt();
        for (int i = 0; i < tcs; i++) {

            // read the number of cannons we have
            int cannons = io.nextInt();

            // calculate our max ammo capacity using number of cannons times capacity per cannon (next int in the file)
            int max = cannons * io.nextInt(); 

            // creating variable for the amount of ammo we have, will read from file in loop below
            int have = 0;

            // add up the ammo in each cannon we currently have by looping through each cannon's ammo value (from 0 to number of cannons)
            for (int j = 0; j < cannons; j++)
                 // add up
                have += io.nextInt();

            // figure out how much we can get by subtractig what we have from our max capacity
            int needed = max - have;

            // read the cost per order of ammo
            int cost = io.nextInt();

            // read the ammount of ammo per order
            int qty = io.nextInt(); 

            // figure out how many orders we need by seeing how many times the ammo per order goes into the ammo we need
            int num = needed / qty;

            // if the ammount ammo we get from the calculated number of orders doesn't add up exactly to what we need, we get one more order 
            if (needed % qty != 0)
                // one more order 
                num++;

            // calculate the total cost by muliplying cost per order by number of orders
            int result = cost * num;
            out.println(result+" coins");
        }
	}
}