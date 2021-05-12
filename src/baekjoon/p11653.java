package baekjoon;

import java.util.Scanner;

public class p11653 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 2 ; i <= N ; i++){
            while(N % i == 0){
                N /= i;
                System.out.println(i);
            }
        }
    }
}
