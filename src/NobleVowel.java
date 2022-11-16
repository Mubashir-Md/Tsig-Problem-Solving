import java.util.Scanner;

//Question : Given a string S your task is to find out whether a string is Noble Vowel string or not. A Nobel Vowel string is one in which there has to be a vowel after every consonant, but there can be any letter after any vowel. The only exception is a consonant n ; after this letter, there can be any letter (not only a vowel) or there can be no letter at all.

public class NobleVowel {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t!=0){
            String str = in.next();
            for (int i=0;i<str.length();i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ){

                }
            }
            t--;
        }
    }
}
