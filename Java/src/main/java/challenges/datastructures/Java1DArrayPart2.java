package challenges.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nino on 3/25/17.
 * This problem is actually a BFS problem.
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
            Stack<Integer> positionsStack = new Stack();
            try{
                while(true){
                    gameArr[currentPosition] = 1; //Mark current position as visited
                    positionsStack.add(currentPosition);
                    if (gameArr[currentPosition + jumpAmt] == 0) //Try Jumping
                        currentPosition += jumpAmt;
                    else if (gameArr[currentPosition + 1] == 0) //Try moving forward
                        currentPosition++;
                    else if (currentPosition - 1 > 0 && gameArr[currentPosition - 1] == 0) //Try moving backwards
                        currentPosition--;
                    else if (positionsStack.size() < 2) /*I can't go anywhere, I lose! :( */ {
                        System.out.println("NO");
                        break;
                    } else /*REACHED A DEAD END!! Retrace a step and try again*/ {
                        positionsStack.pop(); //Take out the current position you're at
                        currentPosition = positionsStack.pop(); //Retrace a step back
                    }
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                //Reached an index past array size, I WIN!!!
                System.out.println("YES");
            }
        }
    }
}
