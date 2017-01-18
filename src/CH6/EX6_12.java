package CH6;

/**
 * Created by Unumunkh on 1/16/2017.
 */
public class EX6_12 {

    public static void main(String[] args){

        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 0;

        for( ; ch1 <= ch2; ch1++){
            System.out.print(ch1 + " ");
            count++;
            if(count % numberPerLine == 0)
                System.out.println();
        }
    }
}
