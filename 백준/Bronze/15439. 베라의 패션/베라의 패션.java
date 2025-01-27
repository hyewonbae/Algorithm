import java.io.*;
/**
 * 5
 *
 * 20
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n*(n-1));
        br.close();
    }
}
