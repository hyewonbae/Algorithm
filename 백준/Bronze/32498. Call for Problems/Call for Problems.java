/**
 * 2
 * 2
 * 3
 *
 * 1
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if(k%2 == 0) continue;
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
