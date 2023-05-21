package class1;

import java.util.Scanner;

public class prob2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
        }sc.close();

        String out = "";

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]-1){
                out = "ascending";
            }
            else if(arr[i] == arr[i+1]+1){
                out = "descending";
            }
            else{
                out = "mixed";
                break;
            }
        }System.out.println(out);
    }
}
