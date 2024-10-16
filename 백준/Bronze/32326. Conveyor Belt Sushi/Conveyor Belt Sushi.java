/**
 * 0
 * 2
 * 4
 *
 * 28
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int red = Integer.parseInt(br.readLine());
        int greean = Integer.parseInt(br.readLine());
        int blue = Integer.parseInt(br.readLine());
        int total = 0;
        total = red*3 + greean*4 + blue*5;

        System.out.println(total);
        br.close();

    }
}
