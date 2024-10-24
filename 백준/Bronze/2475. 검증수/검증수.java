/**
 * 0 4 2 5 6
 *
 * 1
 * */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreElements()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int result = 0;
        for(int i=0; i<list.size(); i++){
            int k = list.get(i);
            result += k*k;
        }
        System.out.println(result%10);
        br.close();
    }
}
