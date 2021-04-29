package baekjoon;

import java.util.Scanner;

public class p2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++){
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호
            int[][] ar = new int[k+1][n+1];
            int cnt = 0;

            for(int j = 0 ; j <= k ; j++){
                int tmp = 0;

                for(int l = 0 ; l <= n ; l++) {
                    if (l == 0) {
                        ar[j][l] = 0;
                    } else {
                        if (j == 0) {
                            ar[j][l] = l;
                        } else {
                            ar[j][l] = ar[j - 1][l] + tmp;
                            tmp += ar[j - 1][l];
                        }
                    }
                    cnt = ar[j][l];
                }
            }
            System.out.println(cnt);
        }
    }
}
