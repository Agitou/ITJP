package CH6;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX30 {

    public static void main(String[] args){




        boolean result = false;

        int sum = roll();
        int point = sum;

        if(sum == 2 || sum == 3 || sum == 12) {
            result = true;
            System.out.println("You lose");
        }
        else if(sum == 7 || sum == 11) {
            result = true;
            System.out.println("You win");
        }
        else
            System.out.println("point is " + sum);


        while(result == false){
            sum = roll();

            if(sum == point){
                result = true;
                System.out.println("You win");
                break;
            }
            else if(sum == 7){
                System.out.println("You lose");
                break;
            }
            else{
                point = sum;
                System.out.println("point is " + sum);
            }
        }
    }

    public static int roll(){
        int r1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        int r2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        int sum = r1 + r2;

        System.out.println("You rolled " + r1 + " + " + r2 + " = " + sum);
        return sum;
    }
}
