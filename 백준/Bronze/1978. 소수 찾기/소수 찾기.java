import java.io.*;
import java.util.*;

public class Main {
    static int count=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] += Integer.parseInt(st.nextToken());
        }

        for(int k : arr){
            isPrime(k);
            if(isPrime(k)){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isPrime(int k) {
        if(k < 2) return false;
        for(int i=2; i*i<=k; i++){
            if(k % i == 0) return false;
        }
        return true;
    }
}
