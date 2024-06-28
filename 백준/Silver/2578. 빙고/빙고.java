import java.io.*;
import java.util.*;

public class Main {
	static int[][] map = new int[5][5];
	static int ans;
	static int count;
	static int a, b;
	static boolean upStatus = false;
	static boolean downStatus = false;

	static void rowCheck(int a, int b) {
		int zeroCnt = 0;
		for (int i = 0; i < 5; i++) {
			if (map[a][i] == 0) {
				zeroCnt++;
			}
		}
		if (zeroCnt == 5) count++;
	}

	static void colCheck(int a, int b) {
		int zeroCnt = 0;
		for (int i = 0; i < 5; i++) {
			if (map[i][b] == 0) {
				zeroCnt++;
			}
		}
		if (zeroCnt == 5) count++;
	}

	static void upCheck() {
		int zeroCnt = 0;
		if (!upStatus) {
			for (int i = 0; i < 5; i++) {
				if (map[4-i][i] == 0) {
					zeroCnt++;
				}
			}
			if (zeroCnt == 5) {
				count++;
				upStatus = true;
			}
		}
	}

	static void downCheck() {
		int zeroCnt = 0;
		if (!downStatus) {
			for (int i = 0; i < 5; i++) {
				if (map[i][i] == 0) {
					zeroCnt++;
				}
			}
			if (zeroCnt == 5) {
				count++;
				downStatus = true;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		for(int []b:map)System.out.println(Arrays.toString(b));
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				ans = Integer.parseInt(st.nextToken());

				for (int m = 0; m < 5; m++) {
					for (int n = 0; n < 5; n++) {
						if (ans == map[m][n]) {
							map[m][n] = 0; // 0으로 바꾸기
							a = m;
							b = n;
						}
					}
				}

//				count = 0;
				rowCheck(a, b);
				colCheck(a, b);
				upCheck();
				downCheck();

				// 종료조건
				if (count >= 3) {
					System.out.println(i * 5 + j + 1);
					return;
				}
			}
		}

	}

}
