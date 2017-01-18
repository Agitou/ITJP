package CH6;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX6_13 {

    public static void main(String[] args){

        System.out.println("i\t\tm(i)");

        System.out.println(String.format("%20s", "").replace(' ', '-'));

        for(int i = 1; i <= 20; i++){

            System.out.printf("%2d\t\t%7.4f\n", i, m(i));
        }

    }

    public static double m(int i){

        double sum = 0;

        for(int j = 1; j <= i; j++){

            sum += (double) j / (j + 1);
        }

        return sum;
    }
}
