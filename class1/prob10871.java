package class1;
import java.util.*;
public class prob10871 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int [N];
        

        for(int i =0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(X>arr[i]){System.out.print(arr[i]+" ");}
        }
        sc.close();
    }
}
