package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX26 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Creates list1
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for(int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        //Creates list2
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for(int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        if(equals(list1, list2))
            System.out.print("Two lists are strictly identical");
        else
            System.out.print("Two lists are not strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2){

        //Find the lesser length of the 2 lists
        int min = list1.length;
        if(list2.length < list1.length)
            min = list2.length;

        for(int i = 0; i < min; i++)
            if(list1[i] != list2[i])
                return false;

        return true;
    }
}
