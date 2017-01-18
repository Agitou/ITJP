package CH6;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX18 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String pass = input.nextLine();

        System.out.print("Your password is " + isValid(pass));



    }

    public static boolean isValid(String s){

        boolean validity = true, stop = true;
        int count = 0;

        if(s.length() < 8)
            return false;

        for(int i = 0; i < s.length(); i++){
            if(isLetter(s.charAt(i)) == false && isDigit(s.charAt(i)) == false){
                validity = false;
                break;
            }

            if(isDigit(s.charAt(i))){
                count++;
            }
        }

        if(count < 2)
            validity = false;

        return validity;
    }
}
