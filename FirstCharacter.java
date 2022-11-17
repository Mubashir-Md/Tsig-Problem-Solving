import java.util.Scanner;

//Question : Prepbuddy has a string S consisting of lowercase Latin Letters. The String S can contain some repeated characters, no repeated characters, and maybe all repeated characters. He is trying to find the first character which is non-repeating in S . The String S contains many non-repeating characters, so he is not able to find the answer. You can help him to find the answer. Note:- Print − 1 if there is no non-repeating character.

public class FirstCharacter {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t!=0){
            String str = in.next();
            int count = 0;
            int flag = 0;
            for (int i=0;i<str.length();i++){
                char nonRepeat = str.charAt(i);
                count = 1;
                for (int j=i+1;j<str.length();j++){
                    if (nonRepeat == str.charAt(j)){
                        count = count + 1;
                    }
                }
                if (count == 1){
                    System.out.println(i);
                    flag = 1;
                    break;
                }
                if (flag == 0){
                    System.out.println(-1);
                }
            }
            t--;
        }
    }
}
