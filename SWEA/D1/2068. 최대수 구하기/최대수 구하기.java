import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("res/input_swea_2068.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int test_case = 1; test_case <= n; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int max = Integer.MIN_VALUE; // 처음에 max를 최소값으로 초기화
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken()); // 각 숫자 읽기
                max = Math.max(max, num); // 최대값 갱신
            }
            sb.append("#").append(test_case).append(" ").append(max).append("\n"); // 결과 출력 형식
        }
        System.out.println(sb);
    }
}