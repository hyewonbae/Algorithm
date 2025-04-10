import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static long t;
    static long[] sharks;
    static Queue<Long> queue = new LinkedList<>();
    static Stack<Long> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());  // 상어의 수
        k = Integer.parseInt(st.nextToken());  // 반복 횟수
        t = Long.parseLong(st.nextToken());    // 초기 몸집

        sharks = new long[n];
        st = new StringTokenizer(br.readLine());

        // 상어 크기 입력 받기
        for (int i = 0; i < n; i++) {
            sharks[i] = Integer.parseInt(st.nextToken());
        }

        // 상어를 크기 순으로 정렬
        Arrays.sort(sharks);

        // 상어 크기들을 큐에 넣기
        for (int i = 0; i < n; i++) {
            queue.add(sharks[i]);
        }
        // K번 반복하여 샼의 몸집을 키우기
        for (int tc = 0; tc < k; tc++) {
            // 현재 샼보다 작은 상어들을 스택에 넣기
            while (!queue.isEmpty() && queue.peek() < t) {
                stack.push(queue.poll());
            }

            // 스택에서 가장 큰 상어를 잡아먹기
            if (!stack.isEmpty()) {
                long largestShark = stack.pop();
                t += largestShark;  // 샼의 몸집 증가

                // 현재 샼보다 작은 상어들을 큐에서 꺼내 스택에 넣기
                while (!queue.isEmpty() && queue.peek() < t) {
                    stack.push(queue.poll());
                }
            }
        }

        // 결과 출력 (최대 몸집)
        System.out.println(t);
    }
}
