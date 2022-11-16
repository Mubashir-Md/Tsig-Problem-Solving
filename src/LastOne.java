import java.util.*;
import java.io.*;

//Question: We all know computer understands only 0 and 1. Let's say you are given one such array A consisting
// only 0 's and 1's. Your task is to print the last index of the 1 present in the array.
public class LastOne {
    public static void main(String args[]) throws IOException {

        // Mubashir
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){
            int size = in.nextInt();
            int[] arr = new int[size];
            int key = -1;
            for(int i=0;i<size;i++)
                arr[i] = in.nextInt();
            for(int j=0;j<size;j++){
                if(arr[j]==1){
                    key = j;
                }
            }
            System.out.println(key);
            t--;
        }

    }
}