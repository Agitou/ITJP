package CH6;

/**
 * Created by Unumunkh on 1/16/2017.
 */
public class EX6 {

    public static void main(String[] args){

        int lines = 12;

        for(int i = 1; i <= lines; i++){

            for(int j = 0; j < lines - i; j++)
                System.out.print("   ");

            for(int k = i; k >= 1; k--)
                System.out.printf("%3d", k);

            System.out.println();
        }
    }
}
