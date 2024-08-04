import java.io.*;
import java.util.*;

public class Main {
    // 팩토리얼 계산
    static int fac(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        // 이항계수 n!/r!(n-r)!
        System.out.println(fac(n) / (fac(r) * fac(n - r)));
    }

}
