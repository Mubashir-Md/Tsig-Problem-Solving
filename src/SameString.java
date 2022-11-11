import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t!=0){
            String str = in.next();
            int len = str.length()-1;
            int lim = (str.length()/2)+1;
            for (int i=0;i<=lim;i++){
                if (str.charAt(i) != str.charAt(len-i)){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            t--;
        }
    }
}
