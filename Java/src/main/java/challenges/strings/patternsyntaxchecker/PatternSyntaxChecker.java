package challenges.strings.patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by nino on 3/19/17.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex;
        for(int i = Integer.parseInt(sc.nextLine()); i>0;i--){
            regex = sc.nextLine();

            try{
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
