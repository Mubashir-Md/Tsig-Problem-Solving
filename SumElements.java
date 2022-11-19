import java.math.BigInteger;
import java.util.Scanner;

//Question : Given an array of n integers find the sum of all the elements of the array.
//Note: the elements of the array might be large.

public class SumElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){
            int size = in.nextInt();
            BigInteger[] arr = new BigInteger[size];
            BigInteger sum = new BigInteger("0");
            for (int i=0;i<size;i++){
                arr[i] = in.nextBigInteger();

            }
            for (int i=0;i<size;i++){
                sum = sum.add(arr[i]);
            }
            System.out.println(sum);
            t--;
        }

    }
}