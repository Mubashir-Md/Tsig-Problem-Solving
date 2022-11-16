import java.util.*;
import java.io.*;

//Question : PrepBuddy lives in a colony, where N houses are built in a single row numbered from 0 to N − 1 . The first house has a house number 0 , the second house has a house number 1 and so on, every house pays some rent at the end of the month. Help PrepBuddy in finding out the house number of the house paying the minimum rent. Note: All house rents are unique.

public class MinHouseNo {
    public static void main(String args[]) throws IOException {
        // Mubashir
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){

            int size = in.nextInt();
            int[] arr = new int[size];


            for(int i=0;i<size;i++)
                arr[i] = in.nextInt();
            int min = arr[0];
            int minIndex = 0;

            for(int i=0;i<size;i++){
                if(min>arr[i]){
                    min = arr[i];
                    minIndex = i;
                }
            }
            System.out.println(minIndex);
            t--;
        }

    }
}