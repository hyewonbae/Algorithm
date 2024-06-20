import java.util.*;
import java.io.*;

public class Main {
	static int N, R, C = 0;
	static int[] a, b;
	static boolean[] v;

	static void perm(int cnt) { // cnt : b 배열의 인덱스, 재귀호출의 횟수
		if (cnt == R) {
			for (int i = 0; i < R; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
            C++;
            return;
		}
		// 재귀 본문
		for (int i = 0; i < N; i++) {
			if (v[i])
				continue; // 이미 선택된 숫자는 건너뜀
			v[i] = true;
			b[cnt] = a[i];
			perm(cnt + 1);
			v[i] = false; // 다음에 선택될 수 있도록 해제
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
		v = new boolean[N];

		C = 0;
		perm(0);
//		System.out.println(C);
	}
}
