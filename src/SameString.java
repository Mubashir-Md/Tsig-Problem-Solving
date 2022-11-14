import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t!=0){
            String str = in.next();
            int i = str.length()-1;
            int j = 0;
            if(check(str, i, j))
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
    static boolean check(String str, int i, int j){
        if (str.charAt(i) != str.charAt(j)){
            return false;
        }
        if (i == j) {
            return true;
        }
        if (i > j)
            check(str,i-1,j+1);
        return true;
    }

}
