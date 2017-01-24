package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        System.out.print("Enter the amount of consecutives: ");
        int consecutiveAmount = input.nextInt();

        if (isConsecutiveNumber(values, consecutiveAmount))
            System.out.print("The list has consecutive " + consecutiveAmount + "s.");
        else
            System.out.print("The list has no consecutive " + consecutiveAmount + "s.");
    }

    public static boolean isConsecutiveNumber(int[] values, int conseNum){

        int consecutive = 1;

        //loop through each number
        for(int i = 0; i < values.length; i++) {

            consecutive = 1;

            //loop through the numbers after the current number
            for (int j = i + 1; j < values.length; j++){

                //if current number is the same consecutively conseNum times return true
                if(values[i] == values[j]){
                    consecutive++;
                }

                else
                    break;

                if(consecutive == conseNum)
                    return true;
            }
        }

        return false;
    }
}
