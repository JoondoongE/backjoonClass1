package class1;

import java.util.Scanner;

public class prob2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[6];

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0;i<5;i++){
            arr[i]=arr[i]*arr[i];
            sum +=arr[i];
        }
        arr[5] = sum%10;

        System.out.println(arr[5]);
        sc.close();
    }
}
