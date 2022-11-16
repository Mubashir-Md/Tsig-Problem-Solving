import java.util.Scanner;

//Question : PrepBuddy wants you to solve an interesting problem. You will discover an interesting technique while solving this problem.
//You are given an array of N integers in ascending order and a number N . You have to print indexes of two numbers in the array such that the sum equals to number K
//. In case no such pair exists print "no answer"(without quotes).

public class InterestingArray {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t!=0){
            int size = in.nextInt();
            int[] arr  = new int[size];
            for (int i=0;i<size;i++){
                arr[i] = in.nextInt();
            }
            int ans = in.nextInt();
            int sum = 0;
            for (int j=0;j<size;j++){
                int a = ans - arr[j];
                int start = 1;
                int end = size-1;
                while (start<=end){
                    int mid = (start+end)/2;
                    if(a == arr[mid]){
                    }
                    else if (a>arr[mid]) {
                        start = mid+1;
                    }


                }

            }
            System.out.println();
            t--;
        }
    }
}
