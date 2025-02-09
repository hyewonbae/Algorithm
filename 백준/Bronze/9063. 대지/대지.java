import java.io.*;
import java.util.*;
/**
 * 3
 * 20 24
 * 40 21
 * 10 12
 * 
 * 360
 * */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x_axis[] = new int[n];
        int y_axis[] = new int[n];

        for(int i  = 0; i < n; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            x_axis[i] = Integer.parseInt(token.nextToken());
            y_axis[i] = Integer.parseInt(token.nextToken());
        }
        br.close();
        Arrays.sort(x_axis);
        Arrays.sort(y_axis);

        System.out.println((x_axis[n-1]-x_axis[0])*(y_axis[n-1]-y_axis[0]));
        br.close();
    }
}
