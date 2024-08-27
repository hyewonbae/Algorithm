import java.io.*;
import java.util.*;

/**
 * 첫째 줄에 A를 B번 곱한 수를 C로 나눈 나머지를 출력
 * 10 11 12
 *
 * 4
 * A, B, C <= 2,147,483,647
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(pow(a, b, c));
    }

    static long pow(int a, int b, int c) {
        if (b == 0) {
            return 1;
        }

        long half = pow(a, b / 2, c);
        long result = (half * half) % c;

        if (b % 2 == 1) {
            result = (result * a) % c;
        }
        return result;
    }
}