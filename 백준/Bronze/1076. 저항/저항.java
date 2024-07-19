import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Map<String,Integer> map=new HashMap<>();
		
		map.put("black", 0);
		map.put("brown", 1);
		map.put("red", 2);
		map.put("orange", 3);
		map.put("yellow", 4);
		map.put("green", 5);
		map.put("blue", 6);
		map.put("violet", 7);
		map.put("grey", 8);
		map.put("white", 9);
	
		Scanner sc = new Scanner(System.in);
		
		String c1=sc.next();
		String c2=sc.next();
		String c3=sc.next();
		
		int num1=map.get(c1);
		int num2=map.get(c2);
		int num3=map.get(c3);
		
		long result = (num1*10 + num2)*(long)Math.pow(10, num3);
		
		System.out.println(result);
		sc.close();
		
	}
	

}