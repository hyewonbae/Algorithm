import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long,Integer> map = new HashMap<>();
        int n =Integer.parseInt(br.readLine());
        int max = 0;
        long result = 0;
        for(int i = 0; i < n; i++){
            long val = Long.parseLong(br.readLine());
            map.put(val,map.getOrDefault(val, 0)+1);
            if(map.get(val) > max){
                max = map.get(val);
                result = val;
            }else if(map.get(val) == max){
                result = Math.min(result,val);
            }
        }
        System.out.println(result);
        br.close();
    }
}
