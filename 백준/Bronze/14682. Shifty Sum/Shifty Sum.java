import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int sum = n;
        for(int i = 1 ; i <= k ; i++){
            int shiftedN = n * (int) Math.pow(10, i);
            sum += shiftedN;
        }
        System.out.println(sum);
        br.close();
    }
}
