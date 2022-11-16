import java.util.Scanner;

//Question : You are given an M ∗ N matrix, print lower triangular matrix and upper triangular matrix.
//See sample test case for better understanding.

public class LowUpTriangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mat = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                mat[i][j] = in.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i<j){
                    System.out.print(0 + " ");
                }
                else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i>j){
                    System.out.print(0 + " ");
                }
                else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
