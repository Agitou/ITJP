package CH7;

import java.util.Scanner;

/**
 * Created by Agitou on 1/19/17.
 */
public class EX14 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Enter five integers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();


        System.out.print("The greatest common divisor is " + gcd(nums));

    }

    public static int gcd(int... numbers){

        int gcd = 0, min = min(numbers);

        for(int i = 1; i <= min; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[j] % i != 0)
                    break;
            }
            gcd = i;
        }

        for(int j = 0; j < numbers.length; j++){
            if(numbers[j] % gcd != 0)
                gcd--;
        }

        return gcd;
    }

    public static int min(int...numbers){
        int minIndex = 0;

        for(int i = 0; i < numbers.length; i++)
            if(numbers[minIndex] > numbers[i])
                minIndex = i;

        return numbers[minIndex];
    }
}
