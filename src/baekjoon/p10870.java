package baekjoon;

import java.util.Scanner;

public class p10870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = 0;

        int befNum = 1, aftNum = 1;

        if(n == 1 || n == 2){
            tmp = 1;
        } else {
            for(int i = 3 ; i <= n ; i++){
                tmp = befNum + aftNum;
                befNum = aftNum;
                aftNum = tmp;
            }
        }

        System.out.println(tmp);
    }
}
