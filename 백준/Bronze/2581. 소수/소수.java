import java.io.*;
import java.util.*;

/**
 * 60
 * 100
 *
 * 620
 * 61
 * */
public class Main {
    static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                sum+=i;
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            // 소수의 합과 최소값 출력
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
