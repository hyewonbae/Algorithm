import java.io.*;
import java.util.*;

public class Main {
	    public static void main(String[] args) throws Exception{
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st=new StringTokenizer(br.readLine()," ");
	    	
	    	int n=Integer.parseInt(st.nextToken());
	    	int m=Integer.parseInt(st.nextToken());
	    	int k=Integer.parseInt(st.nextToken());
	    	
	    	int[] a= {n,m,k};
	    	
	    	Arrays.sort(a);
	    	System.out.println(a[1]);
	    	
	    }
}