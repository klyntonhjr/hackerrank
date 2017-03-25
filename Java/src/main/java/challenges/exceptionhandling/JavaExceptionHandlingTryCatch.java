package challenges.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nino on 3/25/17.
 */
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        try{
            x = sc.nextInt();
            y = sc.nextInt();

            System.out.print(x/y);
        } catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.print("java.lang.ArithmeticException: / by zero");
        }
    }
}
