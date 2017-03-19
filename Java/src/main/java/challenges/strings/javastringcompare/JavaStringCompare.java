package challenges.strings.javastringcompare;

import java.util.Scanner;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int subLen = sc.nextInt();

        int lowerbound = 0;
        int upperbound = subLen;
        int maxbound = word.length();
        String lowest = "";
        String greatest = "";
        lowest = greatest = word.substring(lowerbound, upperbound);
        String compareWith = "";
        while(upperbound <= maxbound){
            compareWith = word.substring(lowerbound++, upperbound++);

            if(lowest.compareTo(compareWith) > 0)
                lowest = compareWith;

            if(greatest.compareTo(compareWith) < 0)
                greatest = compareWith;
        }

        System.out.println(lowest);
        System.out.println(greatest);
    }
}
