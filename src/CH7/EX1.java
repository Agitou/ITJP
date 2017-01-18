package CH7;

import java.util.*;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class EX1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];
        int bestIndex = 0;

        System.out.print("Enter " + scores.length + " scores: ");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if(scores[i] > scores[bestIndex])
                bestIndex = i;
        }

        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " +
                    grade(scores[i], scores[bestIndex]));
        }
    }

    public static char grade(int score, int bestScore){

        if(score >= bestScore - 10)
            return 'A';
        else if(score >= bestScore - 20)
            return 'B';
        else if(score >= bestScore - 30)
            return 'C';
        else if(score >= bestScore - 40)
            return 'D';

        return 'F';
    }
}
