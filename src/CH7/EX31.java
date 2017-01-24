package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX31 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Get list1
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for(int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        //Get list2
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for(int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        //Get merged list from the method
        int[] mergedList = merge(list1, list2);

        //Print out the merged list
        System.out.print("The merged list is ");
        for(int i = 0; i < mergedList.length; i++)
            System.out.print(mergedList[i] + " ");

    }

    public static int[] merge(int[] list1, int[] list2){

        int[] mergedList = new int[list1.length + list2.length];
        int i;
        //Copy list1 items onto mergedList
        for(i = 0; i < list1.length; i++){
            mergedList[i] = list1[i];
        }

        //Copy list2 items onto mergedList
        for(int j = 0; j < list2.length; j++, i++) {
            mergedList[i] = list2[j];
        }
        System.out.print("Number of comparisons made is " + selectionSort(mergedList) + "\n");


        return mergedList;
    }

    public static int selectionSort(int[] list){
        int count = 0;

        for(int i = 0; i < list.length; i++){
            int currentMinIndex = i;
            int iCopy = list[i];

            for(int j = i + 1; j < list.length; j++)
                if(list[currentMinIndex] > list[j]) {
                    currentMinIndex = j;
                    count++;
                }

            if(currentMinIndex != i){
                list[i] = list[currentMinIndex];
                list[currentMinIndex] = iCopy;
            }
        }

        return count;
    }
}
