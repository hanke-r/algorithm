package baekjoon;

import java.io.*;

public class p2447 {

    private static final String zero = " ";
    private static final String s = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());


        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                draw(bw, i, j, n);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    static void draw(BufferedWriter bw, int i, int j, int n) throws IOException{
        if((i / n) % 3 == 1 && (j / n) % 3 == 1){
            bw.write(zero);
        } else{
            if(n / 3 == 0){
                bw.write(s);
            } else {
                n = n / 3;
                draw(bw, i , j , n);
            }
        }
    }
}
