package challenges.strings.javastringintroduction;

import java.util.Scanner;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println((a+b).length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        String aAndB =
                a.substring(0,1).toUpperCase() + a.substring(1) + " "
                + b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(aAndB);
    }
}
