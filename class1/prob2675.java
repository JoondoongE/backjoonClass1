package class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class prob2675 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // for (int i = 0; i < n; i++) {

        //     int r = sc.nextInt();
        //     String s = sc.next();

        //     for (int j = 0; j < s.length(); j++) {
        //         for (int k = 0; k < r; k++) {
        //             System.out.print(s.charAt(j));
        //         }
        //     }
        // }
        // sc.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
	
			String[] str = br.readLine().split(" ");	// 공백 분리
			
			int R = Integer.parseInt(str[0]);	// String -> int
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}

    }
}