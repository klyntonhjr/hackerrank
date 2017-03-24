package challenges.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by nino on 3/16/17.
 */
public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        IntStream.range(1,11).forEach(i -> System.out.println(n + " x " + i + " = " + n*i));
    }
}
