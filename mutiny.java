import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class mutiny {
    static ArrayList<Pirate> pirates = new ArrayList<Pirate>();
    static int optimal = 0;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = scan.nextInt(); scan.nextLine(); 
        int[] swords = new int[n];
        int[] attacks = new int[n];
        for (int i = 0; i < n; i++) {
            attacks[i] = scan.nextInt();
        }
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            swords[i] = scan.nextInt();
        }
        //I make all these pirate objects and then I add them to an array so its easy to store them
        for (int i = 0; i < n; i++) {
            pirates.add(new Pirate(attacks[i], swords[i]));
        }

        //call to helper method
        solve(n-1, 0, 0, max);
        out.println(optimal);
        

    }
    /*
     Let me go over what each parameter is:
     n: is the index of my arraylist that has all the pirates. Because the arraylist is a static variable, it can be accessed in all methods. I start at the end of my arraylist and 
     go until n is less than 0
     currStrength: currStrength is how much strength I have right now with who I have accounted for as pirates. I need to always make sure that this number
     is less than max
     currSwords: If i add a pirate, then I have to add how many swords he brings with him. Remember, my goal is to get the max number of swords!
     */
    static void solve(int n, int currStrength, int currSwords, int max) {
        //recursive base case
        if (n < 0 || currStrength > max) {
            return;
        }
        // with brute force recursive algorithms, the key idea is that you have to make a decision at every step: Do I include the pirate or not?
       
        /*This first set of code, I include the given pirate into my calculations. This means that I have to add all its corresponding values 
        to my currStrengh and currSwords and use those into my next recursive call
        */
        Pirate pirate = pirates.get(n);
        int newStrength = currStrength + pirate.attackVal;
        int newSwords = currSwords + pirate.numSwords;
        if (newStrength <= max) { //I have to check if the newStrength is less than max, only then can say yes to putting it in
            if (newSwords > optimal) {
                optimal = newSwords;
            
            }
            solve(n-1, newStrength, newSwords, max); //So here, this recursive call is if I do include the new pirate into my calculations
        }
        solve(n-1, currStrength, currSwords, max);  //This recursive call is if I dont include the pirate
    }
    
}
 //making a class for a Pirate makes handling the data so much easier to use so thats why i did that
class Pirate {
    int attackVal;
    int numSwords;

    public Pirate(int attackVal, int numSwords) {
        this.attackVal = attackVal;
        this.numSwords = numSwords;
    }

    public String toString() {
        return attackVal + " " + numSwords;
    }
}