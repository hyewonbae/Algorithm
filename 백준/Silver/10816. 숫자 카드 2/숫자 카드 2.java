/**
 * 10
 * 6 3 2 10 10 10 -10 -10 7 3
 * 8
 * 10 9 -5 2 3 4 5 -10
 *
 * 3 0 0 1 2 0 0 2
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer,Integer> map=new HashMap<>();
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            int number = Integer.parseInt(st.nextToken());
            map.put(number,map.getOrDefault(number,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<m;i++){
            int number = Integer.parseInt(st.nextToken());
            if(map.containsKey(number)){
                sb.append(map.get(number)+" ");
            } else{
                sb.append(0+" ");
            }

        }
        System.out.println(sb);
    }
}