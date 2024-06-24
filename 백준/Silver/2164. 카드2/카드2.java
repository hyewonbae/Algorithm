import java.util.*;
import java.io.*;

//queue
public class Main {

	public static void main(String[] args) throws Exception {
		Queue<Integer> queue=new LinkedList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		
		for(int i=1;i<N+1;i++) {
			queue.offer(i);
		}
		while(queue.size()>1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
		
		br.close();
	}

}
