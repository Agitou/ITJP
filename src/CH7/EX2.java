package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();

        System.out.println("Numbers in reverse: ");
        for(int i = nums.length - 1; i >= 0; i--)
            System.out.print(nums[i] + " ");
    }
}
