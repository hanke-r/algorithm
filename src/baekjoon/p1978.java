package baekjoon;

import java.util.Scanner;

public class p1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            int minor = sc.nextInt();
            boolean flag = true;

            if(minor < 2){
                flag = false;
            }

            for(int j = 2 ; j <= (int) Math.sqrt(minor) ; j++){
                if(minor % j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
