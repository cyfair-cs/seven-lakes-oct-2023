import static java.lang.System.*;
import java.util.*;
import java.io.*;

class QuarterMaster {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("Quartermaster.txt"));
        int totalMoney = s.nextInt();
        int totalPeople = s.nextInt();
        s.nextLine();
        int shares = 0;
        TreeMap<String, Integer> crew = new TreeMap<String, Integer>();
        for(int i = 0;i < totalPeople;i++){
            String[] a = s.nextLine().split(" ");
            crew.put(a[0] + a[1], Integer.parseInt(a[2]));
            shares += Integer.parseInt(a[2]);
        }
        System.out.printf("%n|Name|Role|# of Shares|% of Total|Money|\n");
        for (String key: crew.keySet()) {
            double percent = crew.get(key) / shares;
            System.out.printf("%n|");
        }

        
    }
}
