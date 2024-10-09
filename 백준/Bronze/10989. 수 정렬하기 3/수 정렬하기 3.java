/**
 * 10
 * 5
 * 2
 * 3
 * 1
 * 4
 * 2
 * 3
 * 5
 * 1
 * 7
 *
 * 1
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * 5
 * 5
 * 7
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];  // 숫자의 범위가 1 ~ 10000

        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // count 배열을 순차적으로 탐색하면서, 빈도만큼 숫자를 출력
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }

        System.out.print(sb);
        br.close();
    }
}
