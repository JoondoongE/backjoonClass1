package class1;

import java.util.Scanner;

public class prob2562 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];

        for(int i=0;i<9;i++){
            arr[i] = sc.nextInt();
        }

        int max=0, num=0;

        for(int i =0;i<9;i++){
            if(max<arr[i]){
                max=arr[i];
                num=i+1;
            }
        }
        System.out.println(max);
        System.out.println(num);
        sc.close();
    }
}
