package CH7;

import java.util.Scanner;

/**
 * Created by Agitou on 1/21/17.
 */
public class EX18 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];

        System.out.print("Enter 10 doubles: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextDouble();

        bubbleSort(nums);

        System.out.println("After sort: ");
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

    }

    public static void bubbleSort(double[] values){

        boolean flag = true;
        int count;

        while(flag){

            count = 0;

            for(int i = 0; i < values.length - 1; i++){
                if(values[i] > values[i + 1]){
                    double temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                    count++;
                }
            }

            if(count == 0)
                flag = false;

        }
    }
}
