package CH8;

import java.util.Scanner;

/**
 * Created by Agitou on 1/29/17.
 */
public class EX2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[][] values = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix: ");
        for(int i = 0; i < values.length; i++)
            for(int j = 0; j < values[i].length; j++)
                values[i][j] = input.nextDouble();

        System.out.print("Sum of the elements in major diagonal is " + sumMajorDiagonal(values));
    }

    public static double sumMajorDiagonal(double[][] m){

        double sum = 0;

        for(int i = 0; i < m.length; i++)
            for(int j = i; j < i + 1; j++)
                sum += m[i][j];

        return sum;
    }
}
