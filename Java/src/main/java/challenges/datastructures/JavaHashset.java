package challenges.datastructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by nino on 4/11/17.
 */
public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> nameSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            nameSet.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(nameSet.size());
        }
    }
}
