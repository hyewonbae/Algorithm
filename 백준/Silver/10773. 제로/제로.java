import java.io.*;
import java.util.*;

//stack
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());	
		
		 for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
		
		System.out.println(sum);
		
	}

}
