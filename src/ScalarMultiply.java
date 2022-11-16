import java.util.*;
import java.io.*;

//Question : You are given a M∗N matrix, and a variable K, print the resultant matrix after scalar multiplication.
public class ScalarMultiply {
    public static void main(String args[]) throws IOException {
        //You are given a M ∗ N matrix, and a variable K , print the resultant matrix after scalar multiplication.
        // Mubashir
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x = in.nextInt();
                mat[i][j] = x*k;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}