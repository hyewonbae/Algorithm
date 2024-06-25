import java.io.*;
import java.util.*;

public class Main {
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
				
		Set<String> set = new LinkedHashSet<>();	// LinkedHashSet : 입력순서 유지하면서 중복제거
		for(int i=0;i<n;i++) {
			set.add(br.readLine());
		}
		
		String[] a = set.toArray(new String[0]);	//Set은 중복제거에 유용하지만 정렬지원 x, 배열로 변환
		Arrays.sort(a,new Comparator<String>() {	

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);					
				}
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
		
		for(String str:a) System.out.println(str);
	}

}
