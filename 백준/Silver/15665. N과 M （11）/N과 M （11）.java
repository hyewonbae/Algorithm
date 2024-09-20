/**
 * 4 2
 * 9 7 9 1
 *
 * 1 1
 * 1 7
 * 1 9
 * 7 1
 * 7 7
 * 7 9
 * 9 1
 * 9 7
 * 9 9
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

/**
 * 중복 순열 문제를 해결하는 방식
 * 동일한 숫자들이 있을 수 있으므로 Set을 사용하여 중복된 결과를 제거합니다.
 */

public class Main {
    static int[] nums;
    static int n, m;
    static int[] result;
    static LinkedHashSet<String> set = new LinkedHashSet<>(); // 중복된 결과를 방지하기 위해 Set 사용
    static StringBuilder sb = new StringBuilder();

    static void perm(int cnt) {
        if (cnt == m) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < m; i++) {
                temp.append(result[i]).append(" ");
            }
            String resultStr = temp.toString().trim();

            // 중복된 결과는 Set에서 걸러짐
            set.add(resultStr);
            return;
        }
        for (int i = 0; i < n; i++) {
            result[cnt] = nums[i];
            perm(cnt + 1);
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
        perm(0);

        // Set에 저장된 결과를 StringBuilder에 추가
        for (String s : set) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
