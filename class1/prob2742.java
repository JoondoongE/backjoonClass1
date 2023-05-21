package class1;

import java.util.Scanner;

public class prob2742 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        while(number != 0){
            System.out.println(number);
            number--;
        }
        sc.close();
    }
}
