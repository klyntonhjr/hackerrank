package weekofcode31;

import java.util.Scanner;

/**
 * Created by nino on 4/10/17.
 */
public class BeautifulWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        final String VOWEL_SET = "aeiouy";

        char c, cnext;
        String outmsg = "Yes";
        int strlen = str.length();
        for (int i = 0; i < strlen - 1; i++) {
            c = str.charAt(i);
            cnext = str.charAt(i+1);
            if(c == cnext || (VOWEL_SET.indexOf(c) != -1 && VOWEL_SET.indexOf(cnext) != -1))
                outmsg = "No";
        }
        System.out.println(outmsg);
    }
}
