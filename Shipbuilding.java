import static java.lang.System.*;
import java.util.*;
import java.io.*;

class Shipbuilding {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int firstInt=s.nextInt();
        s.nextLine();
        for(int c=0;c<firstInt;c++){
         String[] list=s.nextLine().split(" "); 
         int x = Integer.parseInt(list[0]);
         int a = Integer.parseInt(list[1]);
         int b = Integer.parseInt(list[2]);
         int d = Integer.parseInt(list[3]);
        if(x<=a)
            System.out.println("Plastic");
        else if(x<=b)
            System.out.println("Wood");
        else
            System.out.println("Metal");
          
        }
        
    }
}
