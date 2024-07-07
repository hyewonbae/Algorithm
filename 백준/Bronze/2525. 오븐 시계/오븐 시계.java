import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st=new StringTokenizer(br.readLine()," ");
       int h=Integer.parseInt(st.nextToken());
       int m=Integer.parseInt(st.nextToken());
       int input=Integer.parseInt(br.readLine());
       int min=m+input;
       if(min>=60) {
    	   h+=min/60;
    	   min=min%60;
       }
       if(h>=24) {
    	   h-=24;
       }
       System.out.println(h+" "+min);
    }
    
}
