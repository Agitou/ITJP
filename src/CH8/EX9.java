package CH8;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/30/2017.
 */
public class EX9 {

    public static void main(String[] args){

        ticTactoe();
    }

    public static void ticTactoe(){

        Scanner input = new Scanner(System.in);;

        boolean result = true;
        int[][] board = new int[3][3];
        int r, c, turn = 0;

        printBoard(board);

        while(result){

            System.out.print("Enter a row (0, 1, 2) for player");
            if(turn % 2 == 0)
                System.out.print(" X: ");
            else
                System.out.print(" O: ");
            r = input.nextInt();

            System.out.print("Enter a column (0, 1, 2) for player");
            if(turn % 2 == 0)
                System.out.print(" X: ");
            else
                System.out.print(" O: ");
            c = input.nextInt();

            if(board[r][c] == 0){
                board[r][c] = turn % 2 + 1;
            }
            else{
                System.out.println("Slot is taken");
            }

            turn++;

            printBoard(board);
            if(checkBoard(board)) {
                result = false;
                System.out.print("gg\n");
            }
        }

    }

    public static void printBoard(int[][] board){

        for(int i = 0; i < board.length; i++){

            System.out.print("|");

            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0)
                    System.out.print(" |");
                else if(board[i][j] == 1)
                    System.out.print("X|");
                else
                    System.out.print("O|");
            }

            System.out.println();
        }
    }

    public static boolean checkBoard(int[][] board){

        //
        boolean flag = true;

        //Check rows
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[i].length - 1; j++){
                if(board[i][j] != 0 && board[i][j] != board[i][j + 1])
                    return false;
            }
        }


        //Check columns
        for(int j = 0; j < board[0].length; j++){
            for(int i = 0; i < board.length - 1; i++){
                if(board[i][j] != 0 && board[i][j] != board[i + 1][j])
                    return false;
            }
        }

        //Check major diagonal
        for(int i = 0; i < board.length; i++){
            if(board[i][board[0].length - 1 - i] != 0
                    && board[i][board[0].length - 1 - i] != board[i + 1][board[0].length - 1 - i])
                return false;
        }


        //Check minor diagonal
        for(int i = 0; i < board.length - 1; i++){
            if(board[i][i] != 0 && board[i][i] != board[i + 1][i + 1])
                return false;
        }

        System.out.print("is this calling5");
        return true;
    }


}
