/**
 * 4
 * Baha enter
 * Askar enter
 * Baha leave
 * Artem enter
 *
 * Askar
 * Artem
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            String strName = st.nextToken();
            String strStatus = st.nextToken();
            if(strStatus.equals("enter")){
                set.add(strName);
            } else if(strStatus.equals("leave")){
                set.remove(strName);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for(String s : list){
            System.out.println(s);
        }
    }
}
