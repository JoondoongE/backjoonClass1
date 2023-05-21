package class1;

import java.util.*;

public class prob1152 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        StringTokenizer st = new StringTokenizer(s," ");
        System.out.println(st.countTokens());
    }
}
