package challenges.introduction;

import java.util.Scanner;

/**
 * Created by nino on 3/16/17.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(
                "================================\n" +
                String.format("%-15s%03d\n", scan.next(), scan.nextInt()) +
                String.format("%-15s%03d\n", scan.next(), scan.nextInt()) +
                String.format("%-15s%03d\n", scan.next(), scan.nextInt()) +
                "================================"
        );
    }
}
