/**
 * 1 2
 *
 * 1
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long n = Long.parseLong(st.nextToken());
        Long m = Long.parseLong(st.nextToken());

        Long count = (n*m)/2;
        System.out.println(count);
        
    }
}
