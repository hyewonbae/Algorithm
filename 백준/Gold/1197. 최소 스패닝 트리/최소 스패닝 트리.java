import java.io.*;
import java.util.*;

public class Main {
	static int N;	//정점의 개수
	static int[][] g;	//간선 정보 저장 배열
	static int[] p;		//부모 배열
	
	static void make() {
		p=new int[N+1];
		for(int i=0;i<N+1;i++)p[i]=i;	
	}
	
	static int find(int a) {	
		if(p[a]==a) return a;
		return p[a]=find(p[a]);
	}
	
	static boolean union(int a,int b) { 
		int aRoot=find(a);
		int bRoot=find(b);
		if(aRoot==bRoot) return false; 	
//		if(aRoot<bRoot) p[bRoot]=aRoot;
//		else p[aRoot]=bRoot;
		p[bRoot]=aRoot;
		return true;

	}
	
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		int E=sc.nextInt();
//		System.out.println(N+","+ E);
		
		g=new int[E][3];
		
		for(int i=0;i<E;i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			int cost=sc.nextInt();
			g[i]=new int[] {from,to,cost};
			
		}
//		for(int[] e:g)System.out.println(Arrays.toString(e));System.out.println();
		Arrays.sort(g,(o1,o2)->Integer.compare(o1[2], o2[2]));	//기본데이터 타입인 경우
//		for(int[] e:g)System.out.println(Arrays.toString(e));System.out.println();
//		Arrays.sort(g,(o1,o2)->o1[2].compareTo(o2[2]));			//기본데이터 타입 아닌 경우 
		
		make();
		int sum=0, cnt=0;
		for(int[] e:g) {
			if(union(e[0],e[1])) {
				sum+=e[2];
				if(++cnt==N-1) break;		// ++cnt 하는 이유:
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}
