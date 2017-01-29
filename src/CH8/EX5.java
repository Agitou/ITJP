package CH8;

import java.util.Scanner;

/**
 * Created by Agitou on 1/29/17.
 */
public class EX5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c;


        System.out.print("Enter matrix1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = input.nextDouble();
            }

        }

        System.out.print("Enter matrix2 ");
        for(int i = 0; i < b.length; i++)
            for(int j = 0; j < b[i].length; j++)
                b[i][j] = input.nextDouble();

        c = addMatrix(a, b);

        System.out.println("The matrices are added as follows: ");
        for(int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[i].length; j++)
                System.out.printf("%-5.1f", c[i][j]);

            System.out.println();
        }


    }

    public static double[][] addMatrix(double[][] a, double[][] b){

        if (a.length != b.length || a[0].length != b[0].length)
            return null;

        double[][] result = new double[a.length][a[0].length];

        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
