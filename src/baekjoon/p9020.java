package baekjoon;

import java.util.Scanner;

public class p9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        get_prime();

        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int a = n / 2;
            int b = n / 2;

            while(true){
                if(!prime[a] && !prime[b]){
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
    }

    private static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i])
                continue;
            for(int j = i * i ; j < prime.length ; j += i){
                prime[j] = true;
            }
        }
    }
}
