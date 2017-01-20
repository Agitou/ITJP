package CH7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Agitou on 1/19/17.
 */
public class EX16 {

    public static void main(String[] args){

        int key = getRandom(0, 100000);
        int[] nums = new int[100000];
        int i;

        //Time variables
        long startTime, endTime, executionTime;

        System.out.println("Negative numbers = key doesn't exist");

        //Linear Search
        startTime = System.currentTimeMillis();
        i = linearSearch(nums, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("\nThe execution time for linear search is " + executionTime + " and key is at " + i);

        //Selection Sort
        startTime = System.currentTimeMillis();
        selectionSort(nums);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("\nThe execution time for selection sort is " + executionTime);

        //Binary Search
        startTime = System.currentTimeMillis();
        i = binarySearch(nums, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("\nThe execution time for binary search is " + executionTime + " and key is at " + i);


    }

    public static int binarySearch(int[] nums, int key){

        int low = 0;
        int high = nums.length - 1;

        while(high >= low){
            int mid = (high + low) / 2;

            if(nums[mid] == key)
                return key;
            else if(nums[mid] > key)
                low = mid + 1;
            else
                high= mid -1;
        }

        return -low - 1;

    }

    public static void selectionSort(int[] nums){

        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < nums.length; j++){
                if(nums[currentMinIndex] > nums[j])
                    currentMinIndex = j;
            }
            if(currentMinIndex != i) {
                nums[i] = nums[currentMinIndex];
                nums[currentMinIndex] = temp;
            }

        }
    }

    public static int linearSearch(int[]nums, int key){

        for(int i = 0; i < nums.length; i++)
            if(nums[i] == key)
                return key;

        return -1;

    }

    public static int getRandom(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
