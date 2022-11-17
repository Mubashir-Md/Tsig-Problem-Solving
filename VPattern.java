import java.util.Scanner;

//Question : Print in the output the exact pattern provided below
//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321

public class VPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        int k = 10;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            k = k-2;
            int m = k;
            for(;m>=1;m--) {
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
