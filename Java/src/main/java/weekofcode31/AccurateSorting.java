package weekofcode31;

import java.util.Scanner;

/**
 * Created by nino on 4/12/17.
 */
public class AccurateSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            int x, y, temp;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                for (int j = a_i; j > 0; j--) {
                    x = a[j];
                    y = a[j-1];
                    if(x < y && Math.abs(x-y) == 1){
                        temp = a[j];
                        a[j] = a[j-1];
                        a[j-1] = temp;
                    } else
                        break;
                }
            }

            // Write Your Code Here
            String isSorted = "Yes";
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]) {
                    isSorted = "No";
                    break;
                }
            }
            System.out.println(isSorted);
        }
    }
}
