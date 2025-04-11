import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n, m, r;
    static int[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int layerCnt = Math.min(n,m) / 2;

        for(int layer = 0; layer < layerCnt; layer++) {
            int top = layer;
            int bottom = n - 1 - layer;
            int left = layer;
            int right = m - 1 - layer;

            List<Integer> list = new ArrayList<>();

            // 위쪽, 좌로 밀기
            for (int i = left; i < right; i++) {
                list.add(map[top][i]);
            }
            // 오른쪽, 위로 올리기
            for (int i = top; i < bottom; i++) {
                list.add(map[i][right]);
            }
            // 아래쪽, 우로 밀기
            for (int i = right; i > left; i--) {
                list.add(map[bottom][i]);
            }
            // 왼쪽, 아래로 내리기
            for (int i = bottom; i > top; i--) {
                list.add(map[i][left]);
            }

            int len = list.size();
            int turn = r % len;

            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(list.subList(turn,len));
            rotated.addAll(list.subList(0,turn));

            //  배열 채우기
            int idx = 0;

            // 위쪽
            for (int i = left; i < right; i++) {
                map[top][i] = rotated.get(idx++);
            }
            // 오른쪽
            for (int i = top; i < bottom; i++) {
                map[i][right] = rotated.get(idx++);
            }
            // 아래쪽
            for (int i = right; i > left; i--) {
                map[bottom][i] = rotated.get(idx++);
            }
            // 왼쪽
            for (int i = bottom; i > top; i--) {
                map[i][left] = rotated.get(idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int[] row : map) {
            for(int value : row){
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
