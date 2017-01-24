package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX28 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int[] nums = new int[input.nextInt()];

        System.out.print("Enter the integers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();

        combinationFinder(nums);
    }

    public static void combinationFinder(int[] nums){

        int count = 0;

        //Loop through every number for their combinations
        for(int i = 0; i < nums.length - 1; i++){

            //Print all the combinations for the current number: i
            for(int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + ", " + nums[j] + ")  ");
                count++;
            }

            //New line for the next number
            System.out.println();
        }

        System.out.print("\nTotal amoutn of combinations: " + count);
    }
}
