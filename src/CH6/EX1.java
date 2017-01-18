package CH6;

/**
 * Created by Unumunkh on 1/16/2017.
 */
import java.util.*;

public class EX1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 100; i++){
            if(i % 11 == 0)
                System.out.println();
            System.out.print(getPentagonalNumber(i) + " ");
        }


    }

    public static int getPentagonalNumber(int n){
        return n * (3*n - 1) / 2;
    }
}
