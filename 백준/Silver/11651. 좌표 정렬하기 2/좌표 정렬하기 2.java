import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());

		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a[i][0] = Integer.parseInt(st.nextToken());
			a[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.println(a[i][0] + " " + a[i][1]);
		}

	}

}