package CH7;

import java.util.Scanner;

/**
 * Created by Agitou on 1/19/17.
 */
public class EX15 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        //Reading in inputs
        System.out.print("Please enter 10 integers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();

        //Method call
        int[] distinct = eliminateDuplicates(nums);

        //Distinct values print-out
        System.out.print("The distinct values are: ");
        for(int i = 0; i < distinct.length; i++)
            System.out.print(distinct[i] + " ");
    }

    //Distinct array method
    public static int[] eliminateDuplicates(int[] list){

        int[] distinct = new int[0];
        boolean flag = true;

        for(int i = 0; i < list.length; i++){

            for(int j = 0; j < distinct.length; j++){
                if(list[i] == distinct[j]) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                distinct = expandArray(distinct, list[i]);
            }

            flag = true;

        }

        return distinct;
    }

    //Method to continuously add values to an array
    public static int[] expandArray(int[] array, int number){

        int[] newArray = new int[array.length + 1];

        duplicateArray(array, newArray);

        newArray[array.length] = number;

        return newArray;
    }

    //Method to copy source array's values to target's
    public static void duplicateArray(int[] src, int[] trgt){

        if(src.length > trgt.length)
            return;

        for(int i = 0; i < src.length; i++)
            trgt[i] = src[i];
    }
}
