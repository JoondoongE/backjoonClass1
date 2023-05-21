package class1;

import java.util.Scanner;

public class prob2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h= sc.nextInt();
        int m= sc.nextInt();
        int  totalM = m-45;
        
        if(totalM<0){
            h = h-1;
            if(h<0){
                h=23;
            }
            totalM = 60 + totalM;
        }

        System.out.println( h + " " + totalM);
        sc.close();
    }
}
