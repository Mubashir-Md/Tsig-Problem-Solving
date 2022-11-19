import java.util.Scanner;

public class GreaterNeighbor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t!=0){
            int size = in.nextInt();
            int[] arr = new int[size];
            for (int i=0;i<size;i++){
                arr[i] = in.nextInt();
            }
            int flag = 0;
            for (int j=0;j<size;j++){
                if(j==0) {
                    if (arr[j] > arr[j+1]) {
                        System.out.print(j + " ");
                        flag = 1;
                    }
                }
                else if (j>0 && j<size-1){
                    if ((arr[j] > arr[j-1]) && (arr[j] > arr[j+1])){
                        System.out.print(j + " ");
                        flag = 1;
                    }
                }
                else {
                    if (arr[j] > arr[j-1]){
                        System.out.print(j + " ");
                        flag = 1;
                    }
                }

            }
            if(flag == 0)
                System.out.println(-1);
            System.out.println();
            t--;
        }

    }
}
