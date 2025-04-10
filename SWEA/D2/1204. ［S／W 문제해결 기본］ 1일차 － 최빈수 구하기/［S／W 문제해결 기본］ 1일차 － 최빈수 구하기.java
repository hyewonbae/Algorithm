import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("res/input_swea_1204.txt"));
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            Map<Integer, Integer> map = new HashMap<>();
            while(st.hasMoreTokens()){
                int score = Integer.parseInt(st.nextToken());
                map.put(score, map.getOrDefault(score, 0) + 1);
            }

            int minFreq = 0;
            int count = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();
                if (value > count || (value == count && key > minFreq)) {
                    count = value;
                    minFreq = key;
                }
            }
            sb.append("#").append(test_case).append(" ").append(minFreq).append("\n");
        }
        System.out.println(sb);
    }
}
