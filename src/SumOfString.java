import java.util.Scanner;

public class SumOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t!=0){
            int size = in.nextInt();
            String str = in.next();
            String[] divs = new String[size];
            for (int i=0;i<size;i++){
//                divs[i] = str.split(" ");
            }

            for (String i : divs) {
                System.out.println(i);
            }
            t--;
        }
    }
}
