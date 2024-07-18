import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		Set<String>set=new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(br.readLine());
		}
		
		List<String> tempSet = new ArrayList<>();

		int cnt=0;
		for(int i=0;i<m;i++) {
			String str=br.readLine();
			if(set.contains(str)) {
				cnt++;
				tempSet.add(str);
			}
		}
		
		Collections.sort(tempSet);
		for(String str : tempSet) sb.append(str).append('\n');
		System.out.println(cnt);
		System.out.println(sb.toString());

	}

}
