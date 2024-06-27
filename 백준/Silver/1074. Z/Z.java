import java.io.*;
import java.util.*;
/**
 * Math.pow(2, N) : 2의 N승
 */
public class Main {
	static int N,r,c,ans;
	static void drawZ(int i, int j, int size) { //i=3,j=1,size=4
		/*
		 * if(배열크키가 1인 경우){
		 * 	return;
		 * }
		 * 
		 * // 현재 구역을 4분할하여 탐색
         *	if () { // 1사분면
         *     
         *	} else if () { // 2사분면
         *    	count += 이전 사분면의 사이즈만큼*2
         * 	} else if () { // 3사분면
         *    	count += 이전 사분면의 사이즈만큼*3
         * 	} else { // 4사분면
         *   	count += 이전 사분면의 사이즈만큼*4
         *	}
	     */
		
		if(size==1) {
			System.out.println(ans);
			return;
		}
		

		if(r<i+size/2 && c<j+size/2) {
			drawZ(i,j,size/2);
		}else if(r<i+size/2 && c>=j+size/2) {
			ans+= size*size/4;
			drawZ(i,j+size/2,size/2);
		}else if(r>=i+size/2 && c<j+size/2) {
			ans+= size*size/4*2;
			drawZ(i+size/2,j,size/2);			
		}else {
			ans+= size*size/4*3;
			drawZ(i+size/2,j+size/2,size/2);						
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());	//2		
		r=Integer.parseInt(st.nextToken());	//3
		c=Integer.parseInt(st.nextToken());	//1
		
        // 제약 조건 체크
		if (N<1 || N>15) {
			return;
		}
		if (r<0 || r>=Math.pow(2, N) || c<0 || c>= Math.pow(2, N)) {
			return;
		}
        
		ans=0;
		drawZ(0,0,(int)Math.pow(2, N));		//한변의 사이즈: 4
	}

}
