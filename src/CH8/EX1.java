package CH8;

import java.util.Scanner;

/**
 * Created by Agitou on 1/29/17.
 */
public class EX1 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        double[][] values = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for(int i = 0; i < values.length; i++)
            for(int j = 0; j < values[i].length; j++)
                values[i][j] = input.nextDouble();

        for(int i = 0; i < values[0].length; i++)
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(values, i));

    }

    public static double sumColumn(double[][] m, int columnIndex){

        double sum = 0;

        for(int r = 0; r < m.length; r++)
            sum += m[r][columnIndex];

        return sum;
    }
}
