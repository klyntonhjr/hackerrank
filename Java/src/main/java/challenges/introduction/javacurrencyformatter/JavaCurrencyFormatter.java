package challenges.introduction.javacurrencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nino on 3/19/17.
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormatter.format(payment));
        System.out.println("India: " + indiaFormatter.format(payment));
        System.out.println("China: " + chinaFormatter.format(payment));
        System.out.println("France: " + franceFormatter.format(payment));
    }
}
