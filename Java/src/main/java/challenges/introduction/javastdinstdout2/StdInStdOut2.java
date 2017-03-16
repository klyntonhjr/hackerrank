package challenges.introduction.javastdinstdout2;

import java.util.Scanner;

/**
 * Created by nino on 3/16/17.
 */
public class StdInStdOut2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String intInput = scan.nextLine();
        String doubleInput = scan.nextLine();
        String strInput = scan.nextLine();
        String outPutMsg =  "String: " + strInput + "\n" +
                            "Double: " + Double.parseDouble(doubleInput) + "\n" +
                            "Int: " + intInput;

        System.out.println(outPutMsg);
    }
}
