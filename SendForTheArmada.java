import static java.lang.System.*;
import java.util.*;
import java.io.*;

class SendForTheArmada { 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A"); alphabet.add("B"); alphabet.add("C"); alphabet.add("D"); alphabet.add("E"); alphabet.add("F"); alphabet.add("G"); alphabet.add("H"); alphabet.add("I"); alphabet.add("J"); alphabet.add("K"); alphabet.add("L"); alphabet.add("M"); alphabet.add("N"); alphabet.add("O"); alphabet.add("P"); alphabet.add("Q"); alphabet.add("R"); alphabet.add("S"); alphabet.add("T"); alphabet.add("U"); alphabet.add("V"); alphabet.add("W"); alphabet.add("X"); alphabet.add("Y"); alphabet.add("Z");

        int t = s.nextInt();
        s.nextLine();
        for(int i = 0;i < t;i++){
            int shift = s.nextInt() % 26;
            String sentence = s.nextLine().toUpperCase().substring(1);

            for(int a = 0;a < sentence.length();a++){
                
                if(alphabet.contains(sentence.substring(a, a + 1))){
                    int newLetter = alphabet.indexOf(sentence.substring(a, a + 1)) + shift;
                    if(newLetter < 0){
                        System.out.print(alphabet.get(alphabet.size() + newLetter).toUpperCase());
                    }
                    else{
                        System.out.print(alphabet.get(newLetter).toUpperCase());
                    }
                }
                else{
                    System.out.print(sentence.substring(a, a + 1));
                }
                
            }
            out.println();
        }
    }
}
