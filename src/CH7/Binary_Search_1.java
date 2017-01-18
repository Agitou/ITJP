package CH7;

/**
 * Created by Unumunkh on 1/17/2017.
 */
public class Binary_Search_1 {

    public static void main(String[] args){

        int[] l1 = new int[50];
        int key = 12;

        for(int i = 0; i < l1.length; i++)
            l1[i] = i * i;

        for(int i = 0; i < l1.length; i++){
            System.out.printf("%5d", l1[i]);
            if(i % 11 == 0)
                System.out.println();;
        }
        System.out.println("\n\nNumber of tries it took to find " + key + ": " + BinarySearch(l1, key));
    }

    public static int BinarySearch(int[] list, int key){
            int low = 0;
            int high = list.length - 1;
            int count = 0;

            while(high >= low){
                int mid = (low + high) / 2;
                if(key == list[mid]) {
                    return mid;
                }
                else if(key > list[mid]){
                    low = mid + 1;
                }
                else
                    high = mid - 1;
                count++;
            }

            return -1;
    }
}
