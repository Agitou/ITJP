package CH7;

import java.util.Scanner;

/**
 * Created by Agitou on 1/20/17.
 */
public class EX17 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStu = input.nextInt();

        String[] names = new String[numOfStu];
        int[] scores = new int[numOfStu];

        System.out.print("Enter the students' name and scores: ");
        for(int i = 0; i < names.length; i++) {
            names[i] = input.next();
            scores[i] = input.nextInt();
        }


        selectionSort(scores, names);

        for(int i = 0; i < scores.length; i++){
            System.out. println(names[i] + " has " + scores[i]);
        }

    }

    public static void selectionSort(int[] scores, String[] names){

        for(int i = 0; i < scores.length; i++){
            int maxScoreIndex = i;
            int tempScore = scores[i];

            int maxNameIndex = i;
            String tempName = names[i];


            for(int j = i + 1; j < scores.length; j++)
                if(scores[maxScoreIndex] < scores[j])
                    maxScoreIndex = j;

            if(maxScoreIndex != i){
                scores[i] = scores[maxScoreIndex];
                scores[maxScoreIndex] = tempScore;

                names[i] = names[maxNameIndex];
                names[maxNameIndex] = tempName;
            }
        }

    }
}
