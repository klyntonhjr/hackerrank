package challenges.introduction;

import java.util.Scanner;

/**
 * Created by nino on 3/18/17.
 */
public class JavaEOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0; String line = null;
        while(sc.hasNext()){
            line = sc.nextLine();
            System.out.println(++i + " " + line);
        }
    }
}
