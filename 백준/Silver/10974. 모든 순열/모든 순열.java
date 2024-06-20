import java.util.*;
import java.io.*;

public class Main {

	static int N, C = 0;
	static int[] a, b;
	static boolean[] v = new boolean[N]; // N개중에 사용 여부 확인, 중복순열은 사용x

	static void perm(int cnt) { // cnt : b배열의 인덱스 ,재귀호출의 횟수
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
            C++;
            return;
		}
		// 재귀 본문
		for (int i = 0; i < N; i++) {
			if (v[i])
				continue; // 선택 되었는지 확인 , //중복
			v[i] = true; // 중복
			b[cnt] = a[i];
			perm(cnt + 1);

			v[i] = false; // 다음번에 선택할 수 있도록 false로 변경, //중복

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a = new int[N];
        b = new int[N];
        v = new boolean[N];
		for (int i = 0; i < N; i++) {
			a[i] = i + 1; 
		}

		C = 0;
		perm(0);
		
		sc.close();
	}

}