package CH7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Agitou on 1/21/17.
 */
public class EX22 {

    public static void main(String[] args){

        boolean[] board = new int[64];
        int pos = random(0, board.length - 1);

    }

    public static boolean possibleRow(boolean[] board, int pos){

        boolean isPossible = true;
        int rowNumber = 0;

        //find the belonging row and loop through it to check row availability
        for(int i = 0, j = 7; j < board.length; i += 8, j+= 8) {
            if(pos >= i && pos <= j) {
                for (int k = rowNumber * 8; k < k + 8; k++) {
                    if (board[k] && k != pos)
                        return false;
                }
                break;
            }
            rowNumber++;
        }

        return true;

    }

    public static boolean possibleColumn(boolean[] board, int pos){

        int colInitValue = 0;
        int colEndValue = 0;
        int posCopy = pos;

        //find first and last index of the column
        while(posCopy >= 0){
            colInitValue = pos;
            posCopy -= 8;
        }

        posCopy = pos;

        while(pos < board.length){
            colEndValue = pos;
            posCopy += 8;
        }

        //loop through the column values to see if its filled
        for(int i = colInitValue; i < colEndValue; i += 8){
            if(board[i] && i != pos)
                return false;
        }

        return true;

    }

    public static boolean minDiagonal(int[] board, int pos){

        int DiaInitValue = 0;
        int DiaEndValue = 0;
        int posCopy = pos;

        while(posCopy >= 0){
            DiaInitValue = posCopy;
            posCopy -= 7;
        }

        posCopy = pos;

        while(posCopy < board.length){
            DiaEndValue = posCopy;
            posCopy += 7;
        }

    }

    public static boolean majDiagonal(int[] board, int pos)

    public static int random(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
