import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());

			switch (a) {
			case 1: {
				int b = Integer.parseInt(st.nextToken());
				stack.push(b);
				break;
			}
			case 2: {
				if (!stack.isEmpty()) {
					sb.append(stack.peek()).append('\n');
					stack.pop();
				} else {
					sb.append(-1).append('\n');
				}
				break;
			}
			case 3: {
				sb.append(stack.size()).append('\n');
				break;
			}
			case 4: {
				if (!stack.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(1).append('\n');
				}
				break;
			}
			case 5: {
				if (!stack.isEmpty()) {
					sb.append(stack.peek()).append('\n');
				} else {
					sb.append(-1).append('\n');
				}
				break;
			}

			}
		}
		System.out.println(sb);
	}

}