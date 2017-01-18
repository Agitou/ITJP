package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] count = new int[101];
        int number;

        System.out.print("Enter the integers between 1 and 100: ");
        while((number = input.nextInt()) != 0){
            count[number]++;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                System.out.print(i + " occurs " + count[i]);
                if(count[i] > 1)
                    System.out.println(" times.");
                else
                    System.out.println(" time.");
            }
        }
    }
}
