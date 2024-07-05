import java.io.*;
import java.util.*;

public class Main{
    static long recu(int n) {
        if(n==0) {
    		return 1;
    	}
    	if(n==1) {
    		return 1;
    	}
    	return n*recu(n-1);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        System.out.println(recu(k));
       
        br.close();
    }
}