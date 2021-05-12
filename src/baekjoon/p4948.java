package baekjoon;

import java.util.Scanner;

public class p4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int cnt = 0;
            for(int i = n + 1 ; i <= 2 * n ; i++){
                boolean flag = true;
                if(i > 1){
                    for(int j = 2 ; j <= (int)Math.sqrt(i) ; j++){
                        if(i % j == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(i == 2 || flag){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
