import java.io.IOException;
import java.util.*;

/**
 * 가장 작은 카드가 맨 위
 * 제일 위에 있는 카드 버리기,
 * 그 다음 카드를 제일 밑으로 옮기기를 반복
 *
 * 7
 *
 * 1 3 5 7 4 2 6
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        int n=sc.nextInt();

        ArrayDeque<Integer> queue=new ArrayDeque<>();

        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(' '); // 가장 위의 카드 버리기
            if (!queue.isEmpty()) { // 카드가 남아 있을 경우에만 수행
                queue.offer(queue.poll()); // 다음 카드 이동
            }
        }
        System.out.println(sb);
    }
}

