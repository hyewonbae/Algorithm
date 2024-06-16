import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] numbers = new int[5];

		int sum=0, average=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++) {
			numbers[i]=Integer.parseInt(br.readLine());
		}
//		for(int a:numbers)System.out.println(a);
				
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		average=sum/numbers.length;
		System.out.println(average);
		
		int median = numbers[numbers.length /2];
		System.out.println(median);
	
	}

}
