package baekjoon;

import java.util.Scanner;

public class p3053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double euclid = Math.PI * (Math.pow(n, 2));
        double taxicap = 2 * (Math.pow(n, 2));

        System.out.println(String.format("%.6f", euclid));
        System.out.println(String.format("%.6f", taxicap));
    }
}
