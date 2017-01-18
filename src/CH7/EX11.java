package CH7;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/18/2017.
 */
public class EX11 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextDouble();

        System.out.println("The mean of the numbers: " + mean(nums));
        System.out.println("The standard deviation: " + deviation(nums));
    }

    public static double deviation(double[] x){
        double sum = 0;
        double mean = mean(x);

        for(int i = 0; i < x.length; i++){
            sum += Math.pow((x[i] - mean), 2);
        }

        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x){
        double sum = 0;

        for(int i = 0; i < x.length; i++)
            sum += x[i];

        return sum / x.length;
    }
}
