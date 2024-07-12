import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		String a=st.nextToken();
		String b=st.nextToken();
		
		String a1=new StringBuilder(a).reverse().toString();
		String b1=new StringBuilder(b).reverse().toString();
		
		int numA=Integer.parseInt(a1);
		int numB=Integer.parseInt(b1);
		
		if(numA>numB) {
			System.out.println(numA);			
		}else {			
			System.out.println(numB);			
		}
		br.close();
	}
}
