package CH7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Unumunkh on 1/18/2017.
 */
public class EX7 {

    public static void main(String[] args){

        int[] counts = new int[10];

        for(int i = 0; i < 100; i++){
            int random = ThreadLocalRandom.current().nextInt(0, 9 + 1);
            counts[random]++;
        }

        for(int i = 0; i < counts.length; i++){
            System.out.print("\nThe number " + i + " occurs " + counts[i]);
            if(counts[i] > 1)
                System.out.print(" times.");
            else
                System.out.print(" time.");
        }
    }
}
