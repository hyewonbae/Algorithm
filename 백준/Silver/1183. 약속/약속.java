import java.util.*;
import java.io.*;
/**
 * 2
 * 20 18
 * 30 25
 * 
 * 4
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i] = Integer.parseInt(st.nextToken())- Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        if(n%2 == 1) System.out.println(1);
        else System.out.println(Math.abs(arr[n/2]-arr[n/2-1])+1);
    }
}
