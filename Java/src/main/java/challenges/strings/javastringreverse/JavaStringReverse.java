package challenges.strings.javastringreverse;

import java.util.Scanner;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean hasOddLen = word.length()%2 == 0;

        String firstHalf = word.substring(0, hasOddLen ? word.length()/2 : (word.length()+1)/2);
        String reverseSecondHalf = new StringBuilder(
                word.substring(hasOddLen ? (word.length()+1)/2 : word.length()/2, word.length()))
                .reverse().toString();

        System.out.println(firstHalf.compareTo(reverseSecondHalf) == 0 ? "Yes" : "No");
    }
}
