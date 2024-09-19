/**
 * 5
 * 1 0 1
 * 5 2 3
 * 5 5 4
 * 0 1 4
 * 3 7 2
 *
 * 50
 *
 * a,d,g
 * a x (d+g)
 * if(a = d+g){
 *    a x (d+g) 의 두 배 점수
 * }
 * */
import java.io.*;
import java.util.*;
public class Main {
    static int result;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            result = d+g;
            if(result == a){
                result = 2*a*result;
            } else {
                result = a*result;
            }

            arr[i] = result;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        br.close();
    }
}
