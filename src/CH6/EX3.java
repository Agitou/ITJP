package CH6;

/**
 * Created by Unumunkh on 1/16/2017.
 */

import java.util.*;
public class EX3 {

    public static void main(String[] args){
        int count = 0;

        for(int i = 1; i <= 2000; i++){
            if(isPalindrome(i)) {
                System.out.printf("%-5d", i);
                count++;
            }

            if(count % 10 == 0 && count != 0) {
                count = 0;
                System.out.println();
            }
        }

    }

    public static int reverse(int n){

        int reverse = 0;

        while(n != 0){
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int n){

        if(n == reverse(n))
            return true;
        return false;
    }
}
