package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/18/2017.
 */
public class EX12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] values = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();


        reverse(values);
        System.out.print("\nAfter reversal: ");
        for(int e: values)
            System.out.print(e +" ");
    }

    public static void reverse(int[] array){

        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }
}
