package baekjoon;

import java.util.Scanner;

public class p2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;

        for(int i = n ; i >= m ; i--){
            boolean flag = true;

            if(i < 2){
                flag = false;
            }

            for(int j = 2 ; j <= (int)Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                sum += i;
                min = i;
            }
        }
        if(sum == 0){
            System.out.println("-1");
        } else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
