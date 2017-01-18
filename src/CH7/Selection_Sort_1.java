package CH7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class Selection_Sort_1 {

    public static void main(String[] args){

        int[] l1 = new int[50];
        int key = 3;
        int count = 0;

        //Array Initialization
        for(int i = 0; i < l1.length; i++)
            l1[i] = ThreadLocalRandom.current().nextInt(1, 1000 + 1);

        //Before selection
        System.out.println("Before selection sort: ");

        for(int i = 0; i < l1.length; i++){
            System.out.printf("%-5d", l1[i]);
            count++;
            if(count % 10 == 0) {
                count = 0;
                System.out.println();
            }
        }

        //After selection
        selectionSort(l1);
        System.out.println("\n\nAfter selection sort: ");

        for(int i = 0; i < l1.length; i++){
            System.out.printf("%-5d", l1[i]);
            count++;
            if(count % 10 == 0) {
                count = 0;
                System.out.println();
            }
        }
    }


    public static void selectionSort(int[] list){

        for(int i = 0; i < list.length; i ++){
            int currentMinIn = i;
            int temp = list[i];

            for(int j = i + 1; j < list.length; j++){
                if(list[currentMinIn] > list[j]){
                    currentMinIn = j;
                }
            }

            if(currentMinIn != i) {
                list[i] = list[currentMinIn];
                list[currentMinIn] = temp;
            }
        }
    }
}
