package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX32 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Getting numbers
        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];

        for(int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        //Partition
        int count = partition(list);

        //Printing out numbers after partition
        System.out.print("After the partition(number of comparisons is " + count + "), the list is ");
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }

    public static int partition(int[] list){

        int pivot = list[0];
        int pivotPos = 0;
        int count = 0;

        for(int i = 0; i < list.length; i++){

            if(list[i] < pivot){
                insert(list, i, pivotPos);
                pivotPos++;
                count++;
            }
        }

        return count;
    }

    public static void insert(int[] list, int insertingNumber, int insertPos){

        int temp = list[insertingNumber];

        for(int i = insertingNumber; i > insertPos; i--){

            list[i] = list[i - 1];
        }

        list[insertPos] = temp;

    }
}
