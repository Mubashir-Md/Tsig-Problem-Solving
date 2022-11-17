import java.util.Scanner;

//Question : You are given an array of integers of length n and an integer k . You have to now use your recursion + loops skills and solve this problem. The task is to print all the subsequences of length k from the given array. See sample test for better understanding. Note - In a subsequence order of elements remains the same.

public class CombinationNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            int r = in.nextInt();
            int ncr = facto(n)/(facto(r)*facto(n-r));
            printNCR(ncr,r);
            for (int i=0;i<ncr;i++){
                for (int j=i+1;j<=r;j++){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
            t--;
        }
    }
    public static int facto(int num){
        if (num == 0 || num == 1)
            return 1;
        return num*facto(num-1);
    }
    public static void printNCR(int ncr, int r){

    }


}
