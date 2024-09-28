/**
 * 4
 * 1
 * 3
 * 9999
 * 100000
 *
 * 1
 * 16
 * 101248
 * 100000
 * */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int max = k;
            while(k>1){
                if(k%2 == 0){
                    k = k/2;
                } else {
                    k = k*3 + 1 ;
                }
                max = Math.max(max,k);
            }
            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }
}
