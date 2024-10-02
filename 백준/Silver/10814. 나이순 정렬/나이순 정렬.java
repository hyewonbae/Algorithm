import java.io.*;
import java.util.*;

public class Main {

	public static class Person {
		
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Person[] p = new Person[n];
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			p[i]= new Person(age,name);
		}
		

		Arrays.sort(p, (o1,o2)-> o1.age - o2.age);
 
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			sb.append(p[i]);
		}
        
		System.out.println(sb);
		br.close();		
	}

}
