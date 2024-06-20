import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 회의의 개수 입력
        int[][] time = new int[n][2]; // 각 회의의 시작 시간과 종료 시간을 저장할 2차원 배열

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            time[i][0] = start;
            time[i][1] = end;
        }

        // 회의 종료 시간을 기준으로 오름차순 정렬
        // 종료 시간이 같으면 시작 시간을 기준으로 오름차순 정렬
        Arrays.sort(time,(o1, o2)->o1[1] == o2[1]?Integer.compare(o1[0], o2[0]):Integer.compare(o1[1], o2[1]));
        
        
        int last = 0; 
        int count = 0; 


        for (int i = 0; i < n; i++) {
            int start = time[i][0];
            int end = time[i][1];
            if (start >= last) { 
                count++;
                last = end; 
            }
        }

        System.out.println(count); 
        br.close(); 
    }
}
