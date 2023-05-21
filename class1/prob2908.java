package class1;
import java.util.*;
public class prob2908 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        String aa = String.valueOf(a);
        String bb = String.valueOf(b);

        char arr[] = new char[3];
        char brr[] = new char[3];

        for(int i=0;i<arr.length;i++){
            arr[i] = aa.charAt(i);
            brr[i] = bb.charAt(i);
        }

        char temp;
        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        temp = brr[0];
        brr[0] = brr[2];
        brr[2] = temp;

        for(int i=0;i<arr.length;i++){
            sb1.append(String.valueOf(arr[i]));
            sb2.append(String.valueOf(brr[i]));
        }

        a = Integer.parseInt(sb1.toString());
        b = Integer.parseInt(sb2.toString());

        if(a>b){System.out.println(a);}
        else{System.out.println(b);}
    }
}
