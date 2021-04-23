package baekjoon;

import java.util.Scanner;

public class p10250 {

    public static void main(String ar[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int i = 0 ; i < cnt ; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if(N % H == 0){
                System.out.println((H * 100) + (N / H));
            } else{
                System.out.println((N % H) * 100 + ((N / H) + 1));
            }
        }
    }
}
