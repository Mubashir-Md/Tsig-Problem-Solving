import java.util.Scanner;

//Question :Now, we are going to solve a very famous problem, most commonly known as find missing number problem. What happens in this is, you are given an array A with N − 1 elements having values from 1 to N with one element missing. Your task is to find out the missing number. Note - Do not use sorting or any in-built function to solve the question.

public class FindMissing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){
            int size = in.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size-1;i++)
                arr[i] = in.nextInt();
            long sum1 = ((long)size*(size+1))/2;
            long sum2 = 0;
            for(int j=0;j<size-1;j++){
                sum2 = sum2+arr[j];
            }
            System.out.println(sum1-sum2);
            t--;
        }

    }
}
