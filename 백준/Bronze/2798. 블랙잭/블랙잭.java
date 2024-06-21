import java.util.*;
import java.io.*;

public class Main {
	static int N, R, C, sum;
	static int max=Integer.MIN_VALUE;
	static int[] a, b;

	static void comb(int cnt, int start) {
		if (cnt == 3) {
			sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += b[i];
			}
			if (sum <= R) {
				max = Math.max(sum, max);
				return;
			}
			return;
		}
		for (int i = start; i < N; i++) {
			b[cnt] = a[i];
			comb(cnt + 1, i + 1);
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		a = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		b = new int[3];

		C = 0;
		comb(0, 0);
		System.out.println(max);
	}
}
