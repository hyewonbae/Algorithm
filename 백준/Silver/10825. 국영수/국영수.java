/**
 * 1. 국어 점수 감소하는 순서
 * 2. 국어 점수 같으면 영어 점수가 증가하는 순서
 * 3. 국어, 영어 점수 같으면 수학 점수 감소하는 순서
 * 4. 모든 점수가 같으면 이름이 사전 증가하는 순서
 *
 * 12
 * Junkyu 50 60 100
 * Sangkeun 80 60 50
 * Sunyoung 80 70 100
 * Soong 50 60 90
 * Haebin 50 60 100
 * Kangsoo 60 80 100
 * Donghyuk 80 60 100
 * Sei 70 70 70
 * Wonseob 70 70 90
 * Sanghyun 70 70 80
 * nsj 80 80 80
 * Taewhan 50 60 90
 *
 * Donghyuk
 * Sangkeun
 * Sunyoung
 * nsj
 * Wonseob
 * Sanghyun
 * Sei
 * Kangsoo
 * Haebin
 * Junkyu
 * Soong
 * Taewhan
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][4];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                if(o2[1].equals(o1[1])){
                    if(o1[2].equals(o2[2])){
                        if(o1[3].equals(o2[3])){
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            }
        });

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i][0]);
        }
    }
}
