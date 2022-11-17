import java.util.Scanner;

//Question : Print in the output the exact pattern provided below
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

public class NumPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=5;i>=n;i--){
            for(int j=n;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}