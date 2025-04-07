import java.io.*;
import java.util.*;

public class Main {
    static int M,N,H;
    static int[][][] box;
    static int[] dx = {-1,1,0,0,0,0};
    static int[] dy = {0,0,-1,1,0,0};
    static int[] dz = {0,0,0,0,-1,1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];

        Queue<int[]> queue = new LinkedList<>();
        for(int h=0; h<H; h++){
            for(int n=0; n<N; n++){
                st = new StringTokenizer(br.readLine());
                for(int m=0; m<M; m++){
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    if(box[h][n][m]==1){
                        queue.add(new int[]{h,n,m});
                    }
                }
            }
        }

//        for(int h=0; h<H; h++){
//            for(int n=0; n<N; n++){
//                for(int m=0; m<M; m++){
//                    System.out.print(box[h][n][m] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        int day = bfs(queue);
        System.out.println(day);
    }

    public static int bfs(Queue<int[]> q){
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<6; i++){
                int nx = cur[2]+dx[i]; // m
                int ny = cur[1]+dy[i]; // n
                int nz = cur[0]+dz[i]; // h
                if(nx < 0 || nx >= M || ny < 0 || ny >= N || nz < 0 || nz >= H || box[nz][ny][nx] != 0) continue;
                q.offer(new int[]{nz,ny,nx});
                box[nz][ny][nx] = box[cur[0]][cur[1]][cur[2]] + 1;
            }
        }
        int max = 0;
        for (int h=0; h<H; h++){
            for (int n=0; n<N; n++){
                for (int m=0; m<M; m++){
                    if(box[h][n][m]==0) return -1;
                    max = Math.max(max, box[h][n][m]);
                }
            }
        }
        return max-1;
    }
}
