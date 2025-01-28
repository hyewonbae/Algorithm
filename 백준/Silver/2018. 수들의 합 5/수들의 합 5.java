import java.io.*;
/**
 * 15
 *
 * 4
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum += j;
                if(sum > n) break;
                else if(sum == n){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}
