import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[][] power;
	static boolean[] v;

	static int minDiff = Integer.MAX_VALUE;

	static void comb(int count, int idx) {
		if (count == N / 2) {
			diff();
			return;
		}

		for (int i = idx; i < N; i++) {		//스타트팀 구성
			if (!v[i]) {
				v[i] = true;
				comb(count + 1, i + 1);
				v[i] = false;
			}
			
		}
	}

	static void diff() {
		int team_start = 0;		//스타트팀 능력치합
		int team_link = 0;		//링크팀 능력치합

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (v[i] && v[j]) {
					team_start += power[i][j];
					team_start += power[j][i];
				} else if (!v[i] && !v[j]) {
					team_link += power[i][j];
					team_link += power[j][i];
				}

			}
		}

		int val = Math.abs(team_start - team_link);
		
		// 점수차가 0이면 가장 낮은 최솟값으로 탐색 종료
		if(val==0) {
			System.out.println(val);
            System.exit(0);
		}
		
		minDiff = Math.min(val, minDiff);

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		power = new int[N][N];
		v = new boolean[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				power[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		comb(0, 0);
		System.out.println(minDiff);
		br.close();
	}
}