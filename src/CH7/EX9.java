package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/18/2017.
 */
public class EX9 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[] values = new double[10];

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < values.length; i++)
            values[i] = input.nextDouble();

        System.out.print("The minimum number is: " +min(values));
    }

    public static double min(double[] array){
        int currentMinIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[currentMinIndex] > array[i])
                currentMinIndex = i;
        }

        return array[currentMinIndex];
    }
}
