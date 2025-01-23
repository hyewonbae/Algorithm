/**
 * 653 375 1000 1000
 * 
 * 347
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min_x = Math.min(x,w-x);
        int min_y = Math.min(y,h-y);

        System.out.println(Math.min(min_x, min_y));
    }
}
