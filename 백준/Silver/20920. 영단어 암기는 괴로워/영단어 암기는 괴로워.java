/**
 * 앞에 배치하는 조건
 * 1. 자주 나오는 단어
 * 2. 단어의 길이가 길수록
 * 3. 알파벳 사전 순으로
 * 4. 길이가 M이상인 것들만
 *
 * 7 4
 * apple
 * ant
 * sand
 * apple
 * append
 * sand
 * sand
 *
 * sand
 * apple
 * append
 * */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.length()>=M){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }

        List<String> words = new ArrayList<>(map.keySet());
        words.sort((o1,o2)->{
            int c1 = map.get(o1);
            int c2 = map.get(o2);

            if(c1==c2){
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                } else {
                    return o2.length()-o1.length();
                }
            }
            return c2-c1;
        });

        for(int i=0;i<words.size();i++){
            sb.append(words.get(i)).append('\n');
        }
        System.out.println(sb.toString());
        br.close();

    }
}
