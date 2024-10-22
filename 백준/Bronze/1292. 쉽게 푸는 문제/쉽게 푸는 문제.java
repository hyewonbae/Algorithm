/**
 * 3 7
 *
 * 15
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = 0;

        // 1~7
        for (int i=1; i<=end; i++){
            for (int j=1; j<=i; j++){
                count++;
                if(start <= count && count <= end){
                    result += i;
                }
            }
        }
        System.out.println(result);
        br.close();

    }
}
