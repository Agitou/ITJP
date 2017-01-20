package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/21/2017.
 */
public class EX20 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();

        selectionSort(nums);

        System.out.println("After sort");
        for(int i =0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }

    public static void selectionSort(int[] list){

        for(int i = list.length - 1; i >= 0; i--){
            int maxIndex = i;
            int temp = list[i];

            for(int j = i - 1; j >= 0; j--){
                if(list[maxIndex] < list[j])
                    maxIndex = j;
            }
            if(maxIndex != i) {
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
    }
}
