//Author: Amogh Ajoy

import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class armada {
    public static void main(String[] args) throws IOException {
    
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt(); scan.nextLine();
       for (int i = 0; i < n; i++) {
        int cipher = scan.nextInt() % 26; // if the cipher is greater than 26, then it just loops back so mod is the best operator to use here
        String line = scan.nextLine().substring(1).toUpperCase(); //I had to cutoff the first character because it always had a leading space
        String res = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Easy way to keep track of the Alphabet and all the indices
        for (int j = 0; j < line.length(); j++) {
            char c = line.charAt(j);
            if (Character.isLetter(c))  { //simple method to check if c is a etter
                int index = letters.indexOf(c); //get the current index of c from the alphabet
                if (index + cipher >= 26) { //if the cipher makes the current index go over 25, then I have to loop back to the beginning of the alphabet
                    index = (index + cipher) % 26;
                    res += letters.charAt(index);
                }
                else if (index + cipher < 0) { //Same concept as above: if it goes to the "left" of A, then i need to loop back to the end of the alphabet
                    index = (letters.length()) + ((index + cipher) % 26);
                    res += letters.charAt(index);
                }
                else { //This is best case scenario, when there is no out of bounds problems
                    res += letters.charAt(index + cipher);
                }
                
            }
            else {
                res += c;
            }

        
        }
        out.println(res);


       }
        
    }
}