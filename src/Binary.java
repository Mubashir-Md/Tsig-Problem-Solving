import java.util.Scanner;

//Question : Arnab is given a number n . You have to help Arnab print all the binary numbers of length n with no consecutive 1 in lexiographical order.
public class Binary {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t!=0){
            int limit = in.nextInt();
            double nums = 0;
            for (double i=0;i<limit;i++){
                nums = nums + Math.pow(2,i);
            }

            t--;
        }
    }
}
