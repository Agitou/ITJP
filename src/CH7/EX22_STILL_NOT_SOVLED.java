package CH7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Agitou on 1/21/17.
 */
public class EX22_STILL_NOT_SOVLED {

    public static void main(String[] args){

        boolean[] board = new boolean[64];

        int qcount = 0;

        while(qcount < 8){
            int pos = random(0, board.length - 1);

            if(checkPosition(board, pos)) {
                System.out.print("Pos" + pos + " ");
                board[pos] = true;
                qcount++;
            }
        }

        for(int i = 0; i < board.length; i++){
            System.out.print("|");
            if(board[i]) {
                System.out.print("Q");
            }
            else
                System.out.print(" ");

            if((i + 1) % 8 == 0){
                System.out.print("|\n");
            }

        }

    }

    public static boolean checkPosition(boolean[] board, int pos){

        return possibleColumn(board, pos) && possibleRow(board, pos)
               && minDiagonal(board, pos); //&& majDiagonal(board, pos);
    }

    public static boolean possibleRow(boolean[] board, int pos){

        int rowInitValue = 0;
        int rowEndValue = 0;
        int posCopy = pos;

        while(posCopy % 8 != 0){
            rowInitValue = posCopy;
            posCopy--;
        }

        posCopy = pos;

        while(posCopy % 8 != 0){
            rowEndValue = posCopy;
            posCopy++;
        }

        if(rowInitValue != 0)
            rowInitValue--;


        for(int i = rowInitValue ; i < rowEndValue + 1; i++){
            if(board[i])
                return false;
        }

        return true;

    }

    public static boolean possibleColumn(boolean[] board, int pos){

        int colInitValue = 0;
        int colEndValue = 0;
        int posCopy = pos;

        while(posCopy >= 0 ){
            colInitValue = posCopy;
            posCopy -= 8;
        }

        posCopy = pos;

        while(posCopy < board.length ){
            colEndValue = posCopy;
            posCopy += 8;
        }

        for(int i = colInitValue; i <= colEndValue; i += 8){
            if(board[i])
                return false;
        }

        return true;

    }

    public static boolean minDiagonal(boolean[] board, int pos){

        int DiaInitValue = 0;
        int DiaEndValue = 0;
        int posCopy = pos;

        while(posCopy >= 0 && ((posCopy + 1) % 8 != 0)){
            DiaInitValue = posCopy;
            posCopy -= 7;
        }

        posCopy = pos;

        while(posCopy < board.length && (posCopy % 8 != 0)){
            DiaEndValue = posCopy;
            posCopy += 7;
        }

        //System.out.print("In" + DiaInitValue + "En" +DiaEndValue + "Po" + pos + " ");

        for(int i = DiaInitValue; i <= DiaEndValue; i += 7){
            if(board[i])
                return false;
        }

        return true;

    }

    public static boolean majDiagonal(boolean[] board, int pos){

        int DiaInitValue = 0;
        int DiaEndValue = 0;
        int posCopy = pos;

        while(posCopy >= 0){
            DiaInitValue = posCopy;
            posCopy -= 9;
        }

        posCopy = pos;

        while(posCopy < board.length){
            DiaEndValue = posCopy;
            posCopy += 9;
        }

        for(int i = DiaInitValue; i < DiaEndValue; i += 8){
            if(board[i] && i != pos)
                return false;
        }

        return true;
    }

    public static int random(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
