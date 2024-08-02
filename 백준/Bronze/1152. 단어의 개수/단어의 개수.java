import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n=0;

        while(st.hasMoreElements()){
            String s = st.nextToken();
            n++;
        }
        System.out.println(n);

    }
}