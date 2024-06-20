import java.util.*;
import java.io.*;

public class Main {
	static int N, R, C = 0;
	static int[] a, b;
	static StringBuilder sb=new StringBuilder();
	
	static void perm(int cnt) { // cnt : b 배열의 인덱스, 재귀호출의 횟수
		if (cnt == R) {
			for (int i = 0; i < R; i++) {
				sb.append(b[i]).append(" ");
            }
			sb.append("\n");
            C++;
            return;
		}
		// 재귀 본문
		for (int i = 0; i < N; i++) {
			b[cnt] = a[i];
			perm(cnt + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		R = Integer.parseInt(input[1]);

		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i + 1; // 배열 a를 1부터 N까지의 숫자로 초기화
		}

		b = new int[R];
		perm(0);
		System.out.print(sb.toString());
//		System.out.println(C);
	}
}
