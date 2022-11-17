import java.util.Scanner;

//Question : Have you heard of Perfect numbers? If not let me tell you what is it, Perfect Numbers are integers that are equal to the sum of all its divisors except that number itself. Now, given an integer N ,write a program to print true if it is a perfect number or false if it is not a perfect number.

public class PerfectNumsDivs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){
            int num = in.nextInt();
            int sum = 0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum = sum + i;
                }
            }
            if (sum==num)
                System.out.println(true);
            else
                System.out.println(false);
            t--;
        }
    }
}
