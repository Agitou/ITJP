package CH6;

import java.util.Scanner;

/**
 * Created by Unumunkh on 1/16/2017.
 */
public class EX7 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double initAm = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double interest = input.nextDouble() / 100.0;

        System.out.println("Years\tFuture Value");

        for(int i = 1; i <= 30; i++){

            System.out.printf("%-4d\t%6.2f\n", i, futureInvestmentValue(initAm, interest / 12, i));

        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }
}
