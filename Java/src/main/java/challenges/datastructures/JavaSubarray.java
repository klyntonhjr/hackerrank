package challenges.datastructures;

import java.util.Scanner;

/**
 * Created by nino on 3/25/17.
 */
public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int negAccout = 0;
        int sum;
        for (int i = 0; i < size; i++) {
            sum = arr[i];
            if(sum < 0)
                negAccout++;

            for (int j = i+1; j < size; j++) {
                sum += arr[j];
                if(sum < 0)
                    negAccout++;
            }
        }

        System.out.println(negAccout);
    }
}
