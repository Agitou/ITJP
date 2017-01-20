package CH7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Unumunkh on 1/21/2017.
 */
public class EX21 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of balls to drop in: ");
        int balls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int[] slots = new int[input.nextInt()];

        playBean(balls, slots);
    }

    public static void playBean(int balls, int[] slots){

        for(int i = 0; i < balls; i++){

            int result = 0;

            for(int j = 0; j < slots.length - 1; j++) {
                result += random();
            }

            slots[result]++;
            System.out.println();
        }

        int height = maxHeight(slots);

        for(int i = 0; i < height; i++){

            for(int j = 0; j < slots.length; j++){
                System.out.print("|");
                if(slots[j] >= height - i)
                    System.out.print("O");
                else
                    System.out.print(" ");
                if(j == slots.length - 1)
                    System.out.print("|");
            }

            System.out.println();
        }
    }

    public static int random(){

        int num = ThreadLocalRandom.current().nextInt(0, 1 + 1);

        if(num == 1)
            System.out.print("R");
        else
            System.out.print("L");

        return num;
    }

    public static int maxHeight(int[] slots){

        int max = 1;

        for(int i = 0; i < slots.length; i++)
            if(slots[i] > max)
                max = slots[i];

        return max;
    }
}
