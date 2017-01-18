package CH6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX6_17 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);

    }

    public static void printMatrix(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                System.out.print(ThreadLocalRandom.current().nextInt(0, 1 + 1) + " ");
            }

            System.out.println();
        }
    }
}
