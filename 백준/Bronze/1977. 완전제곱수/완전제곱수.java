import java.io.*;
/**
 * 60
 * 100
 * 
 * 245
 * 64
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 1; i*i <= n; i++){
            if(i*i >= m && i*i <= n){
                min = Math.min(min, i*i);
                sum += i*i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
