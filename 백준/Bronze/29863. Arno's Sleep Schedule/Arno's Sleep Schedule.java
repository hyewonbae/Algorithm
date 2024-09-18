import java.io.*;

/**
 * 23
 * 7
 *
 * 8
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if(20 <= n && n <= 23){
            System.out.println(m+24-n);
        } else {
            System.out.println(m-n);
        }
    }
}
