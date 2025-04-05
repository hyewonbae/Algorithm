import java.io.*;
import java.util.*;

public class Main {
    static int[][] map = new int[10][10];
    static int[] paper = {0, 5, 5, 5, 5, 5};
    static int min = Integer.MAX_VALUE;
    public static void dfs(int x, int y, int used){
        if(used >= min) return;

        // 종료조건
        if(isFinished()){
            min = Math.min(min,used);
            return;
        }

        if(y==10){
            dfs(x+1, 0, used);
            return;
        }

        if(map[x][y]==0){
            dfs(x, y+1, used);
            return;
        }

        // 1~5 색종이 시도
        for(int size=5; size>0; size--){
            if(paper[size] > 0 && canAttach(x, y, size)){
                attach(x, y, size, 0);  // 색종이 붙이기
                paper[size]--;
                dfs(x, y+1, used+1);
                attach(x, y, size, 1);  // 되돌리기
                paper[size]++;
            }
        }
    }

    public static boolean isFinished(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(map[i][j]==1) return false;
            }
        }
        return true;
    }

    public static boolean canAttach(int x, int y, int size) {
        if(x+size > 10 || y+size > 10) return false;

        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(map[i][j] == 0) return false;
            }
        }
        return true;
    }

    public static void attach(int x, int y, int size, int value){
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                map[i][j] = value;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, 0); // (0,0) 부터 시작, 사용한 색종이 수 0
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
