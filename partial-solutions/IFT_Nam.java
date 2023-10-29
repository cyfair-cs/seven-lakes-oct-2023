import static java.lang.System.*;
import java.util.*;
import java.io.*;

class InfinitePirateTheorem_Nam {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("B"); alphabet.add("C"); alphabet.add("D"); alphabet.add("F"); alphabet.add("I"); alphabet.add("J"); alphabet.add("K"); alphabet.add("L"); alphabet.add("N"); alphabet.add("O"); alphabet.add("P"); alphabet.add("Q"); alphabet.add("S"); alphabet.add("U"); alphabet.add("V"); alphabet.add("W"); alphabet.add("X"); alphabet.add("Z");
       
        int loopInt=s.nextInt();
        s.nextLine();
        for(int a = 0; a < loopInt;a++){
            String sentence = s.nextLine().toUpperCase();
            boolean invalid = true;
            for(int b=0;b<sentence.length();b++){
                if(alphabet.contains(sentence.substring(b,b+1))){
                    invalid = false;
                   //break; 
                }
                
            }
            if(invalid){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
    }
}
