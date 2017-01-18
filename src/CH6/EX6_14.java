package CH6;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX6_14 {

    public static void main(String[] args){

        System.out.println("i\t\tm(i)");

        System.out.println(String.format("%20s", "").replace(' ', '-'));

        for(int i = 1; i <= 901; i += 100){

            System.out.printf("%3d\t\t%5.4f\n", i, m(i));
        }

    }

    public static double m(int i){

        double sum = 0;

        for(int j = 1; j <= i; j++){

            sum += (double) Math.pow(-1, (j + 1)) / (2*j - 1);
        }

        return 4 * sum;
    }
}
