import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static int[] nums;
    static int n, m;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    static void perm(int cnt, int start, int n, int m) {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int before = 0;
        for (int i = start; i < n; i++) {
            if(nums[i] == before) continue;
            result[cnt] = nums[i];
            perm(cnt + 1, i, n, m); // 재귀 호출로 다음 숫자 선택
            before = nums[i];

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        result = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);  // 오름차순 출력을 위한 정렬
        perm(0,0, n, m);  // 순열 생성 시작

        System.out.print(sb); // 결과 출력
    }
}
