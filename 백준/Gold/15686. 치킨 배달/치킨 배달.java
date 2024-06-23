import java.util.*;
import java.io.*;

public class Main {
	    static int N;	//치킨집 
	    static int M;	//남길 치킨집 수
	    
	    static List<Point> chickenShops, homes;	//각각 치킨집과 집
	    static int MinChickenDist=Integer.MAX_VALUE;	//최소 치킨 거리
	    
	    
	    static void chickenShopsCombi(int si, int ti, Point[] temp) {
	    	if(ti==0) {
	    		check(temp);	//최소 거리를 계산
	    	}else {
	    		for(int i=si;i<chickenShops.size();i++) {
	    			temp[ti-1]=chickenShops.get(i);	// 가게
	    			chickenShopsCombi(i+1, ti-1, temp);
	    		}
	    	}
	    }
	    
	    // 조합에서 구한 치킨집의 목록
	    // 집에서 각 임시 지점까지의 최단 거리의 합을 찾기
	    static void check(Point[] tempShops) {
	    	int distSum=0;
	    	for(Point home:homes) {
	    		int minDist=Integer.MAX_VALUE;
	    		for(Point store:tempShops) {
	    			int dist=Math.abs(store.row-home.row)+Math.abs(store.col-home.col);
	    			minDist=Math.min(dist, minDist);
	    		}
	    		distSum+=minDist;
	    	}
	    	MinChickenDist=Math.min(MinChickenDist, distSum);
	    }
	    
	    static class Point{
	    	int row,col;
	    	
	    	public Point(int r,int c) {
	    		this.row=r;
	    		this.col=c;
	    	}
	    	
//	    	@Override
//	    	public String toString() {
//	    		return "[" + row +", " + col + "]"; 
//	    				
//	    	}
	    }
	    
	    
	    public static void main(String[] args) throws Exception {
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st=new StringTokenizer(br.readLine());
	    	
	    	N=Integer.parseInt(st.nextToken());	//지도의 크기 :N (2<=N<=50)
	    	M=Integer.parseInt(st.nextToken());	//남길 치킨집 수 :(M 1<=M<=13)
	    	
	    	//치킨집과 집으로 구분
	    	chickenShops=new ArrayList<>();
	    	homes=new ArrayList<>();
	    	
	    	for(int r=1;r<=N;r++) {
	    		st=new StringTokenizer(br.readLine());
	    		for(int c=1;c<=N;c++) {
	    			Integer info=Integer.parseInt(st.nextToken());
	    			if(info.equals(1)) {
	    				homes.add(new Point(r,c));
	    			}else if(info.equals(2)) {
	    				chickenShops.add(new Point(r,c));
	    			}
	    		}
	    	}
	    	
//	    	System.out.println(homes);
//	    	System.out.println(chickenShops);
	    	
	    	chickenShopsCombi(0,M,new Point[M]);
	    	
	    	System.out.println(MinChickenDist);
	    }

	   
	}
