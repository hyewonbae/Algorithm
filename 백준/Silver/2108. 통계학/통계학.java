import java.io.*;
import java.util.*;

/**
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값 (소수점 이하 첫째 자리에서 반올림한 값)
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 *
 * 5
 * 1
 * 3
 * 8
 * -2
 * 2
 *
 * 2
 * 2
 * 1
 * 10
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int [n];
        int[] count = new int[8001];
        int max = 0;
        int mode = 0;
        boolean flag = false;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i]+4000]++;
        }

        Arrays.sort(arr);

        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                mode = i-4000;
                max = count[i];
                flag = true;
            }else if(count[i]==max && flag == true){
                mode = i-4000;
                flag = false;
            }
        }
        sb.append(Math.round((double) sum / n)).append("\n");
        sb.append(arr[n/2]).append("\n");

        sb.append(mode).append("\n");
        sb.append(arr[n-1] - arr[0]);

        System.out.println(sb);
    }
}
