import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 시험장 개수
        long answer = n;
        long[] students = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            students[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()," ");
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            students[i] = students[i] - b;
            if(students[i] > 0){
                if(students[i] % c > 0){
                    answer += (int) ((students[i] / c) + 1);
                } else {
                    answer += (int) (students[i] / c);
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
}
