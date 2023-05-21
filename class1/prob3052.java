package class1;

import java.util.Scanner;

public class prob3052 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int total[] = new int[42];
        int sum=0;
        
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            total[arr[i]%42]++;
        }
        
        for(int i=0;i<total.length;i++){
            if(total[i]>0){
                sum++;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
