package challenges.introduction.javaloops2;

import java.util.Scanner;

/**
 * Created by nino on 3/17/17.
 */
public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        int a, b, n;
        String result;
        for(int i=0; i<q; i++){
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();

            result  = buildSeries(a, b, n);
            System.out.println(result);
        }
    }

    public static String buildSeries(int a, int b, int n){
        String result = Integer.toString(a + b);
        int temp;
        for(int i=1; i<n; i++){
            temp = a;
            for(int j=0; j<=i; j++){
                temp += b*Math.pow(2,j);
            }

            result += " " + Integer.toString(temp);
        }

        return result;
    }
}
