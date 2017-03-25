package challenges.datastructures;

import java.util.Scanner;

/**
 * Created by nino on 3/24/17.
 */
public class Java2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        int greatestSum = -100;
        int sum;
        for(int i=0; i < 4; i++){
            for (int j=0; j<4; j++) {
                sum =   arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if (sum > greatestSum)
                    greatestSum = sum;
            }
        }

        System.out.print(greatestSum);
    }
}
