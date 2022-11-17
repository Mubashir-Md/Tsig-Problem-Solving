import java.util.Scanner;

//Question : A simple problem statement with no stories: Given an array of positive integer, find out all the elements that are greater than or equal to all the elements to it's right side.

public class FindTheLeader {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t!=0){
            int size = in.nextInt();
            int[] arr = new int[size];
            for (int i=0;i<size;i++){
                arr[i] = in.nextInt();
            }
            int leader = arr[size-1];
            System.out.print(leader + " ");
                for (int j=size-2;j>=0;j--){
                    if(leader<arr[j]) {
                        leader = arr[j];
                        System.out.print(leader + " ");
                    }
                }

            t--;
            System.out.println();
        }
    }
}
