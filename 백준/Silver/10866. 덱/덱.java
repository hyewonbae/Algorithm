import java.io.*;
import java.util.*;
/**
 * 15
 * push_back 1
 * push_front 2
 * front
 * back
 * size
 * empty
 * pop_front
 * pop_back
 * pop_front
 * size
 * empty
 * pop_back
 * push_front 3
 * empty
 * front
 * 
 * 2
 * 1
 * 2
 * 0
 * 2
 * 1
 * -1
 * 0
 * 1
 * -1
 * 0
 * 3
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push_front": {
                    dq.addFirst(Integer.parseInt(s[1]));
                    break;
                }
                case "push_back": {
                    dq.addLast(Integer.parseInt(s[1]));
                    break;
                }
                case "pop_front": {
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.removeFirst()).append("\n");
                    }
                    break;
                }
                case "pop_back": {
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.removeLast()).append("\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(dq.size()).append("\n");
                    break;
                }
                case "empty": {
                    if(dq.isEmpty()){
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front": {
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.peekFirst()).append("\n");
                    }
                    break;
                }
                case "back": {
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.peekLast()).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
