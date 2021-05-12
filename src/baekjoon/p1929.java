package baekjoon;

import java.util.Scanner;

public class p1929 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i = M ; i <= N ; i++){
            boolean flag = true;
            if(i > 1){
                for(int j = 2 ; j <= (int)Math.sqrt(i) ; j++){
                    if(i % j == 0){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    System.out.println(i);
                }
            }
        }
    }
}
