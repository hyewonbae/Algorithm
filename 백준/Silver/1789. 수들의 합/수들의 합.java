import java.io.*;
/**
 * 200
 * 
 * 19
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long count = 1;
        long sum = 0;
        while(true){
            sum += count;
            if(sum > n) break;
            count++;
        }
        System.out.println(count-1);

    }
}
