
/**
 * 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
 * 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
 * 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 5: 덱에 들어있는 정수의 개수를 출력한다.
 * 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
 * 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 * 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 *  입력                  출력
 * 11
 * 6      []                 1
 * 1 3    [3]                8
 * 1 8    [8,3]              3
 * 7      [8,3]              8
 * 8      [8,3]              3
 * 3      [3]                5
 * 2 5    [3,5]              3
 * 1 2    [2,3,5]
 * 5      [2,3,5]
 * 4      [2,3]
 * 4      [2]
 * */
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int type = Integer.parseInt(st.nextToken());
            int value = 0;
            if(type == 1 || type == 2){
                value = Integer.parseInt(st.nextToken());
            }
            switch(type){
                case 1:
                    dq.addFirst(value);
                    break;
                case 2:
                    dq.addLast(value);
                    break;
                case 3:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.removeFirst()).append("\n");
                    }
                    break;
                case 4:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.removeLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    if(dq.isEmpty()){
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.getFirst()).append("\n");
                    }
                    break;
                case 8:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.getLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}
