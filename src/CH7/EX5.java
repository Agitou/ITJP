package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/18/2017.
 */
public class EX5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int number, k = 0, distinct = 0;
        boolean flag = false;

        System.out.print("Enter ten numbers: ");
        while(k < 10){
            number = input.nextInt();
            flag = true;
            for(int i = 0;i < nums.length; i++){
                if(number  == nums[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                nums[distinct] = number;
                distinct++;
            }
            k++;
        }

        System.out.println("The number of distinct number is " + distinct);
        System.out.print("The distinct numbers are ");
        for(int i = 0; i < distinct; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
