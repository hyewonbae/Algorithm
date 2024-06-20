import java.io.*;
import java.util.*;


public class Main {
	static int N, M, tc, num;
	static int[][] map;
	static int[][] tmpMap;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		tc = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

        st = new StringTokenizer(br.readLine());
		for (int i = 0; i < tc; i++) {
			num = Integer.parseInt(st.nextToken());

			switch (num) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;

			default:
				break;
			}

		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				bw.write(map[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void one() {
		// 상하반대
		tmpMap = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tmpMap[N - i - 1][j] = map[i][j];
			}
		}
		map = tmpMap;
	}

	public static void two() {
		// 좌우반대
		tmpMap = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tmpMap[i][M - j - 1] = map[i][j];
			}
		}
		map = tmpMap;
	}

	public static void three() {
		// 90도 우회전
		tmpMap = new int[M][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tmpMap[j][N - i - 1] = map[i][j];
			}
		}
		int tmp = N;
		N = M;
		M = tmp;
		map = tmpMap;
	}

	public static void four() {
		// 90도 좌회전
		tmpMap = new int[M][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tmpMap[M - j - 1][i] = map[i][j];
			}
		}
		int tmp = N;
		N = M;
		M = tmp;
		map = tmpMap;
	}

	public static void five() {
		tmpMap = new int[N][M];
		for(int i = 0; i < N; i++)  {
			for(int j=0; j<M; j++) {
				tmpMap[i][j] = map[i][j];
			}
		}
		
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int T = tmpMap[i][j]; // a1 백업
				tmpMap[i][j] = tmpMap[N / 2 + i][j]; // b1 <- 4
				tmpMap[N / 2 + i][j] = tmpMap[N / 2 + i][M / 2 + j]; // c4 <- 3
				tmpMap[N / 2 + i][M / 2 + j] = tmpMap[i][M / 2 + j]; // d3 <- 2
				tmpMap[i][M / 2 + j] = T; // e2 <- T
			}
		}
		map = tmpMap;

	}

	public static void six() {
		tmpMap = new int[N][M];
		for(int i = 0; i < N; i++)  {
			for(int j=0; j<M; j++) {
				tmpMap[i][j] = map[i][j];
			}
		}
		
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < M / 2; j++) {
				int T = tmpMap[i][j]; // a1 백업
				tmpMap[i][j] = tmpMap[i][j + M/2]; // 1<-2
				tmpMap[i][M / 2 + j] = tmpMap[N / 2 + i][M /2 +j]; // 2<-3
				tmpMap[N / 2 + i][M / 2 + j] = tmpMap[N / 2 + i][j]; //3<-4
				tmpMap[i + N / 2][j] = T; // e2 <- T
			}
		}
		map = tmpMap;
	}

}
