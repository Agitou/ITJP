package CH8;

import java.util.Scanner;

/**
 * Created by Agitou on 1/29/17.
 */
public class EX6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c;

        System.out.print("Enter matrix1: ");
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j <a[i].length; j++)
                a[i][j] = input.nextDouble();

        System.out.print("Enter matrix2: ");
        for(int i = 0; i < b.length; i++)
            for(int j = 0; j <b[i].length; j++)
                b[i][j] = input.nextDouble();

        c = multiplyMatrix(a, b);

        for(int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++)
                System.out.printf("%-5.1f", c[i][j]);

            System.out.println();;
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){

        double[][] result = new double[a.length][b[0].length];

        if(a[0].length != b.length)
            return null;


        //loop through result matrix
        for(int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[i].length; j++) {

                for (int v = 0; v < a[0].length; v++)
                    result[i][j] += a[i][v] * b[v][j];

            }

        }

        return result;
    }

}


