import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        StringBuilder sb=new StringBuilder();        		

        int n = Integer.parseInt(st.nextToken());
        Set<Integer> cardSet = new HashSet<>(); // HashSet 사용
        st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }
        st=new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(st.nextToken());
        int[] queries = new int[m];
        
        st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < m; i++) {
            queries[i] = Integer.parseInt(st.nextToken());
        }

     // 숫자 카드에 숫자가 있는지 확인
        for (int i = 0; i < m; i++) {
            if (cardSet.contains(queries[i])) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
