package CH7;

/**
 * Created by Agitou on 1/19/17.
 */
public class EX14_2ND {

    public static int findGcd(int... numbers) {

        //Find the smallest integer in the number list

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        //Find the GCD
        while (smallest > 1) {

            int counter = 0;
            int modTot = 0;

            while (counter < numbers.length) {

                modTot += numbers[counter] % smallest;
                counter++;

            }

            if (modTot == 0) {
                //Return the gcd if any
                return smallest;
            }

            //System.out.print(" "+ smallest);
            smallest--;

        }
        //return -1 if there is no gcd
        return 1;
    }

    public static void main(String[] x) {

        System.out.println("The GCD of 15 18 42 108 : "+ findGcd(new int[]{15, 18, 42,108}));
    }
}
