package baekjoon;

import java.util.Scanner;

public class p10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int val = 0;
        int tmp = n;
        if(n == 0){
            System.out.println(1);
        } else {
            for(int i = 1 ; i <= n ; i++){
                if(n - i == 0){
                    break;
                }
                tmp = tmp * (n - i);
            }
            System.out.println(tmp);
        }
    }
}
