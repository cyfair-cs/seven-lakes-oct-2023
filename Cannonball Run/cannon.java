// written by Tim
package complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class cannon {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(in);
        int tcs = io.nextInt();
        for (int i = 0; i < tcs; i++) {
            int cannons = io.nextInt(); // read the number of cannons we have
            int max = cannons * io.nextInt(); // calculate our max ammo capacity using number of cannons times capacity per cannon (next int in the file)
            int have = 0; // creating variable for the amount of ammo we have, will read from file in loop below
            for (int j = 0; j < cannons; j++) // add up the ammo in each cannon we currently have by looping through each cannon's ammo value (from 0 to number of cannons)
                have += io.nextInt(); // add up
            int needed = max - have; // figure out how much we can get by subtractig what we have from our max capacity
            int cost = io.nextInt(); // read the cost per order of ammo
            int qty = io.nextInt(); // read the ammount of ammo per order
            int num = needed / qty; // figure out how many orders we need by seeing how many times the ammo per order goes into the ammo we need
            if (needed % qty != 0) // if the ammount ammo we get from the calculated number of orders doesn't add up exactly to what we need, we get one more oder 
                num++; // one more order
            int result = cost * num; // calculate the total cost by muliplying cost per order by number of orders
            out.println(result+" coins");
        }
	}
}