package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/21/2017.
 */
public class EX19 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.print("This list");
        if(isSorted(list))
            System.out.print(" is already sorted");
        else
            System.out.print(" is not sorted");
    }

    public static boolean isSorted(int[] list){

        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i + 1])
                return false;
        }

        return true;
    }
}
