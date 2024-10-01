/**
 * 10
 * 1 4 2 3 1 4 2 3 1 2
 * 
 * 1 2 3 4
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<Integer> set=new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> list=new ArrayList<>(new HashSet<>(set));
        Collections.sort(list);
        for(int i : list) System.out.print(i+" ");
        br.close();
    }
}
