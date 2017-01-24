package CH7;

/**
 * Created by Unumunkh on 1/25/2017.
 */
public class EX34 {

    public static void main(String[] args){

        System.out.print(sort("abgdagt"));
    }

    public static String sort(String s) {

        char[] chars = s.toCharArray();
        selectionSort(chars);

        return String.valueOf(chars);

    }

    public static void selectionSort(char[] chars) {

        for (int i = 0; i < chars.length; i++) {
            int currentMinIn = i;
            char temp = chars[i];

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[currentMinIn] > chars[j]) {
                    currentMinIn = j;
                }
            }

            if (currentMinIn != i) {
                chars[i] = chars[currentMinIn];
                chars[currentMinIn] = temp;
            }
        }
    }

}
