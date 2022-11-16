import java.util.Scanner;

//Question : Tina is given a string S
// which contains the first letter of all the student names in her class. She got a curiosity to check how many people have their names starting from the same alphabet. So given a string S
//, she decided to write a code that finds out the count of characters that occur more than once in the string.
public class DuplicateCharacter {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t!=0){
            String str = in.next();

            for (int i=0;i<str.length();i++){
                int count = 0;
                char key;
                for (int j=0;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count = count+1;
                    }
                }
                if(count>1) {
                    key = str.charAt(i);
                }
//                System.out.print(key + "=" + count + " ");
            }

            t--;
        }
    }
}
