package baekjoon;

import java.util.Scanner;

public class p1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int v = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            double plusR = Math.pow(r1 + r2, 2);
            double minusR = Math.pow(r2 - r1, 2);

            if(x1 == x2 && y1 == y2 && r1 == r2){
                System.out.println(-1);
            } else if(v > plusR || v < minusR) {
                System.out.println(0);
            } else if(v == minusR || v == plusR) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
