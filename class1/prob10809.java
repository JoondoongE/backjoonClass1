package class1;

import java.util.*;

public class prob10809 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[26];  
        Arrays.fill(arr, -1);     
        String w = sc.next();

        for(int i=0;i<w.length();i++){
            if('a'<= w.charAt(i) && w.charAt(i)<='z'){
                if(arr[w.charAt(i)-'a'] == -1){
                    arr[w.charAt(i)-'a'] = i;
                }
                else{
                    continue;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
