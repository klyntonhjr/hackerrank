package challenges.introduction.javaifelse;

import java.util.Scanner;

/**
 * Created by nino on 3/15/17.
 */
public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2 == 1){
            System.out.println("Weird");
        } else if(n < 6 || n > 20){
            System.out.println("Not Weird");
        } else { // 6 < n <= 20
            System.out.println("Weird");
        }
    }
}
