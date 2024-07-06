import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       StringBuilder sb=new StringBuilder();
       int N=sc.nextInt();
       
       for(int i=0;i<N;i++) {
    	   int a=sc.nextInt();
    	   int b=sc.nextInt();
    	   String st="Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b) ;
    	   sb.append(st).append('\n');
       }
    		System.out.println(sb);
    }
}
