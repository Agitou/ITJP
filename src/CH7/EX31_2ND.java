package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX31_2ND {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2:");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] list3 = merge(list1, list2);

        System.out.print("The merged list is ");

        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i]+ " ");
        }

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];

        int count = 0;

        int j = 0, k = 0;
        for (int i = 0; i < list3.length; i++) {
            if (k < list2.length&&list1[j] > list2[k] ) {
                list3[i] = list2[k];
                k++;
                count++;
            } else if (j < list1.length) {
                list3[i] = list1[j];
                j++;
            }

        }

        System.out.print("Number of comparisons made is " + count + "\n");

        return list3;

    }

}
