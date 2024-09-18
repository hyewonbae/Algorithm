/**
 * 4 2
 * 9 7 9 1
 * 
 * 1 7
 * 1 9
 * 7 9
 * 9 9
 * */
import java.io.*;
import java.util.*;

public class Main {
    static int[] nums;
    static int n, m;
    static int[] result;
    static boolean[] visited;
    static LinkedHashSet<String> uniqueResults = new LinkedHashSet<>();
    static StringBuilder sb = new StringBuilder();

    static void perm(int cnt, int start) {
        if (cnt == m) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < m; i++) {
                temp.append(result[i]).append(" ");
            }
            uniqueResults.add(temp.toString().trim());
            return;
        }

        for (int i = start; i < n; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // 중복 방지
            result[cnt] = nums[i];
            perm(cnt + 1, i + 1); // i + 1로 변경하여 중복을 방지
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        result = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        perm(0, 0);

        uniqueResults.forEach(System.out::println);
    }
}
