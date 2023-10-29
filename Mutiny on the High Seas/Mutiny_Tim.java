// tim
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class mutiny {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(new File("mut.txt"));
        int n = io.nextInt();
        int max = io.nextInt();
        io.nextLine();
        String[] points = io.nextLine().split(" ");
        String[] swords = io.nextLine().split(" ");
        int sum = 0;
        int maxSwords = 0;
        for (int i = 0; i < n; i++) {
            sum+=Integer.valueOf(points[i]);
            if (sum <= max) {
                maxSwords += Integer.valueOf(swords[i]);
            }
        }
        out.println(maxSwords);
	}
}

class opponent{
    public int strength, sword;
    public opponent(int strength, int sword) {
        this.strength = strength;
        this.sword = sword;
    }
}