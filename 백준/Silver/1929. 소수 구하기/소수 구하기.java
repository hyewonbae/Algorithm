/**
 * M이상 N이하의 소수 출력
 *
 * 3 16
 *
 * 3
 * 5
 * 7
 * 11
 * 13
 * */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    static boolean isPrime(int i) {
        if(i<2) return false;
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0) return false;
        }
        return true;
    }
}
