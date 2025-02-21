import java.io.*;
import java.util.*;
/**
 * 5 17
 * 
 * 4
 * */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if(n == k){
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[100001];
        visited[n] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        int count = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            count++;
            for(int i=0; i<size; i++) {
                int x = q.poll();
                int [] nextPositions = {x-1, x+1, x*2};

                for(int next : nextPositions){
                    if(next == k) {
                        System.out.println(count);
                        return;
                    }

                    if(next >= 0 && next <= 100000 && !visited[next]) {
                        visited[next] = true;
                        q.add(next);
                    }
                }
            }
        }

    }
}
