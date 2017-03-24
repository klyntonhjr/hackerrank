package challenges.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nino on 3/20/17.
 */
public class JavaRegex3UsernameChecker {
    final static String USERNAME_REGX = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();

            String pattern = USERNAME_REGX;

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
