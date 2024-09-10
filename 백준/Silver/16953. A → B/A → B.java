/**
 * 2 162
 *
 * 5
 * */
import java.io.*;
import java.util.*;

public class Main {
    static Long n;
    static Long k;
    static int cnt;

    static int bfs() {
        Queue<Long> queue = new LinkedList<>();
        queue.offer(n);

        cnt = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Long temp = queue.poll();
                if (temp.equals(k)) {
                    return cnt;
                }
                if (temp * 2 <= k) {
                    queue.offer(temp * 2);
                }
                if (temp * 10 + 1 <= k) {
                    queue.offer(temp * 10 + 1);
                }
            }
            cnt++;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());

        System.out.println(bfs());
    }
}
