package class1;

import java.util.*;

public class prob1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int max=-1;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        float sum=0;

        for(int i=0;i<n;i++){
            float sub = (float)arr[i]/max*100;
            sum += sub;
        }

        System.out.println(sum/n);
        sc.close();
    }
}
