import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb=new StringBuilder();
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		Set<Integer> setA=new HashSet<>();
		Set<Integer> setB=new HashSet<>();
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<a;i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<b;i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		Set<Integer> setDiff = new TreeSet<>(setA);
		setDiff.removeAll(setB);
		
		sb.append(setDiff.size()).append("\n");
		Iterator iter=setDiff.iterator();
		while(iter.hasNext()) {
			sb.append(iter.next()).append(" ");
		}
		 System.out.println(sb.toString().trim());
	}
}
