package class1;
import java.util.*;
public class prob2577 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int total = A*B*C;
        String tt = String.valueOf(total);

        int arr[] = new int[10];

        for(int i=0;i<tt.length();i++){
            for(int j = 0;j<arr.length;j++){
                if(tt.charAt(i)-'0'==j){
                    arr[j]++;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); 
        }
    }
}
