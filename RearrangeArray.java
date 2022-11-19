import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0) {
            int size = in.nextInt();
            int[] arr = new int[size];
            int[] newArr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }
            int j = 0;
            int k = size-1;
            int turn = 1;
            for (int i=0;i<size;i++){
                if (turn == 1){
                    newArr[i] = arr[k];
                    turn = 0;
                    k--;
                }
                else {
                    newArr[i] = arr[j];
                    j++;
                    turn = 1;
                }
            }
            System.out.println(Arrays.toString(newArr));
            t--;
        }
    }
}
