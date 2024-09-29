/**
 * 12
 * 5
 *
 * 1
 * */
import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if(x>0 && y>0){
            n = 1;
        } else if(x>0 && y<0){
            n = 4;
        } else if(x<0 && y>0){
            n = 2;
        } else if(x<0 && y<0){
            n = 3;
        }

        System.out.println(n);
        br.close();
    }
}
