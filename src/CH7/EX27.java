package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX27 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for(int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list1: ");
        int[] list2 = new int[input.nextInt()];

        for(int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        if(equals(list1, list2))
            System.out.print("Two lists are identical");
        else
            System.out.print("Two lists are not identical");
    }

    public static boolean equals(int[] list1, int[] list2){

        if(list1.length != list2.length)
            return false;

        selectionSort(list1);
        selectionSort(list2);

        for(int i = 0; i < list1.length; i++)
            if(list1[i] != list2[i])
                return false;

        return true;

    }

    public static void selectionSort(int[] list){

        for(int i = 0; i < list.length; i++){
            int maxIndex = i;
            int temp = list[i];

            for(int j = i + 1; j < list.length; j++){
                if(list[maxIndex] < list[j])
                    maxIndex = j;
            }

            if(maxIndex != i){
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
    }
}
