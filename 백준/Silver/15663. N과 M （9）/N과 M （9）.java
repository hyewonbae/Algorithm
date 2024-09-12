import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 3 1
 * 4 4 2
 *
 * 2
 * 4
 * */

public class Main {
    static int[] nums;
    static int n,m;
    static int[] result;
    static boolean[] visited;
    static Set<String> uniqueResults = new HashSet<>(); // 중복된 수열을 저장하지 않기 위한 Set
    static StringBuilder sb = new StringBuilder();

    static void perm(int cnt){
        if(cnt==m){
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < m; i++) {
                temp.append(result[i]).append(" ");
            }
            String resultStr = temp.toString().trim();

            // 중복되는 수열 방지
            if (!uniqueResults.contains(resultStr)) {
                uniqueResults.add(resultStr);
                sb.append(resultStr).append("\n");
            }
            return;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                result[cnt]=nums[i];
                perm(cnt+1);
                visited[i]=false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        result = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        perm(0);

        System.out.println(sb);
    }
}
