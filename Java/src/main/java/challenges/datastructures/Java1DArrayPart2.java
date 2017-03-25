package challenges.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nino on 3/25/17.
 */
public class Java1DArrayPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfGames = sc.nextInt();
        int arrSize, jumpAmt;
        int[] gameArr;
        for (int i = 0; i < numOfGames; i++) {
            /* Setup Game */
            arrSize = sc.nextInt();
            jumpAmt = sc.nextInt();
            gameArr = new int[arrSize];
            for (int j = 0; j < arrSize; j++) {
                gameArr[j] = sc.nextInt();
            }

            /* Play Game */
            int currentPosition = 0;
            Stack<Integer> posistionsStack = new Stack();
            //Try jump
            try{
                while(true){
                    gameArr[currentPosition] = 1;
                    posistionsStack.add(currentPosition);
                    if (gameArr[currentPosition + jumpAmt] == 0) //Try Jumping
                        currentPosition += jumpAmt;
                    else if (gameArr[currentPosition + 1] == 0) //Try moving forward
                        currentPosition++;
                    else if (currentPosition - 1 > 0 && gameArr[currentPosition - 1] == 0) //Try moving backwards
                        currentPosition--;
                    else if (posistionsStack.size() < 2) /* I can't go anywhere, I lose! */ {
                        System.out.println("NO");
                        break;
                    } else /* Retrace step and try again */ {
                        posistionsStack.pop(); //Take out the current position you're at
                        currentPosition = posistionsStack.pop(); //Retrace a step back
                    }
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                // I WON!!!
                System.out.println("YES");
            }
        }
    }
}
