/**
 * 7
 * 3 10
 * 5 20
 * 1 10
 * 1 20
 * 2 15
 * 4 40
 * 2 200
 *
 * 45
 * */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        int[] T = new int[Case];//소요 기간
        int[] P = new int[Case];//금액
        for(int i=0;i<Case;i++) {
            T[i]=sc.nextInt();
            P[i]=sc.nextInt();
        }

        int[] dp = new int[Case+1];
        for(int i=0;i<Case;i++) {
            if(i+T[i]<=Case) {	//범위에 벗어나지 않는다면
                dp[i+T[i]]=Math.max(dp[i+T[i]],dp[i]+P[i]);
            }
            dp[i+1]=Math.max(dp[i+1],dp[i]);	//다음dp = 현재 누적값 vs 다음 누적값

        }
        System.out.println(dp[Case]);

    }
}
