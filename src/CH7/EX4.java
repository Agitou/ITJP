package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/18/2017.
 */
public class EX4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number, above, equal, below, sum, j;
        above = equal = below = sum = j = 0;
        int[] scores = new int[100];


        System.out.print("Enter your scores(end input with negative number): ");
        while( (number = input.nextInt()) > 0){
            scores[j] = number;
            sum += number;
            j++;
        }

        int avg = sum / j;

        for(int i = 0;i < j; i++){
            if(scores[i] == avg)
                equal++;
            else if(scores[i] > avg)
                above++;
            else
                below++;
        }


        System.out.println("Number of scores above the average: " + above);
        System.out.println("Number of scores equal to the average: " + equal);
        System.out.println("Number of scores below the average: " + below);

    }
}
