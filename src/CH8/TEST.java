package CH8;

/**
 * Created by Agitou on 1/30/17.
 */
public class TEST {

    public static void main(String[] args) {

        int[][] board = new int[3][3];


        for (int j = 0; j < board[0].length; j++)
            board[0][j] = 1;


        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        int count = 1;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[i].length - 1; j++){
                if(board[i][j] != 0 && board[i][j] == board[i][j + 1])
                    count++;
                if(count == board[i].length) {
                    System.out.print("gg ");
                    System.exit(0);
                }
            }
        }




    }
}

