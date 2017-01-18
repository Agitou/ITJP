package CH7;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Agitou on 1/19/17.
 */
public class EX13 {

    public static void main(String[] args){

        System.out.print(getRandom(1, 2, 3, 4, 6, 7, 10, 9));
    }

    public static int getRandom(int...numbers){
        int number = intRandom(1, 10);
        int i;
        boolean flag = false;

        while(flag != true){
            for(i = 0; i < numbers.length; i++){
                if(number == numbers[i]){
                    number = intRandom(1, 10);
                    break;
                }
            }
            if(i == numbers.length)
                flag = true;
        }

        return number;

    }

    public static int intRandom(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
