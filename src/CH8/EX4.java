package CH8;

import java.util.Scanner;

/**
 * Created by Agitou on 1/29/17.
 */
public class EX4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] employeeHours = new int[8][7];
        int[][] employeeTotHours = new int[8][2];

        for(int i = 0; i < employeeHours.length; i++){


            for(int j = 0; j < employeeHours[i].length; j++) {
                employeeHours[i][j] = input.nextInt();
                employeeTotHours [i][1] += employeeHours[i][j];
            }

            employeeTotHours[i][0] = i;

        }


        selectionSort(employeeTotHours);

        for(int i = 0; i < employeeTotHours.length; i++)
            System.out.println("Employee " + employeeTotHours[i][0] + " worked total of " + employeeTotHours[i][1] + " hours.");
    }

    public static void selectionSort(int[][] nums){

        for(int i = 0; i < nums.length; i++){
            int currentMaxIndex = i;

            for(int j = i + 1; j < nums.length; j++)
                if(nums[currentMaxIndex][1] < nums[j][1])
                    currentMaxIndex = j;

            if(currentMaxIndex != i){
                int tempIndex = nums[i][0];
                int tempMax = nums[i][1];

                nums[i][0] = nums[currentMaxIndex][0];
                nums[i][1] = nums[currentMaxIndex][1];

                nums[currentMaxIndex][0] = tempIndex;
                nums[currentMaxIndex][1] = tempMax;


            }

        }
    }

    /*
    2 4 3 4 5 8 8
    7 3 4 3 3 4 4
    3 3 4 3 3 2 2
    9 3 4 7 3 4 1
    3 5 4 3 6 3 8
    3 4 4 6 3 4 4
    3 7 4 8 3 8 4
    6 3 5 9 2 7 9
     */
}
