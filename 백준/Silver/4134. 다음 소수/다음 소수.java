import java.io.*;
/**
 * 3
 * 6
 * 20
 * 100
 *
 * 7
 * 23
 * 101
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            long prime = Long.parseLong(br.readLine());
            if(prime == 0 || prime == 1){
                sb.append(2).append("\n");
                continue;
            }

            while(true) {
                long cnt = 0;
                for(long j = 2; j <= Math.sqrt(prime); j++) {
                    if(prime % j == 0){
                        cnt++;
                        break;
                    }
                }

                if(cnt == 0){
                    sb.append(prime).append("\n");
                    break;
                }
                prime++;
            }
        }
        System.out.println(sb);
    }
}
