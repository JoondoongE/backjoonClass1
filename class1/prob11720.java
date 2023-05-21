package class1;

import java.util.Scanner;

public class prob11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        String st = sc.next();

        for(int i=0; i<num; i++){
            
            sum +=st.charAt(i)-'0';
        }
        System.out.println(sum);
        sc.close();
    }
}
