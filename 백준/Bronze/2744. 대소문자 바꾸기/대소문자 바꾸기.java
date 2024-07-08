import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s=br.readLine();
        
        for(int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        	if(Character.isUpperCase(c)) {
        		c=Character.toLowerCase(c);
        	}else {
        		c=Character.toUpperCase(c);
        	}
        	sb.append(c);
        }
        System.out.println(sb);
       
        br.close();
    }
}