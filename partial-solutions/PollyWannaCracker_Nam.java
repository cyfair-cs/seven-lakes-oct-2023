import static java.lang.System.*;
import java.util.*;
import java.io.*;

class PollyWannaCracker_Nam {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("Polly Wanna Cracker.txt"));
        
        int t = s.nextInt();
        s.nextLine();
        for(int i = 0;i < t;i++){
            String sentence = s.nextLine();
            int a = 1;
            String newWord = "";
            while((i != sentence.length()) || !((sentence.substring(0, a).equals(sentence.substring(a, a + a))))){
                newWord = sentence.substring(0, a);
                a++;
            }

            if(a == sentence.length()){
                System.out.println(sentence);
            }
            else{
                System.out.println(newWord);
            }
        }
    }
}