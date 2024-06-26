import java.util.*;
import java.io.*;

// LinkedList
public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            LinkedList<Character> list = new LinkedList<Character>();
            
            int pointer = 0; // 현재 위치를 추적할 포인터

            // 입력 문자열의 각 문자를 처리
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (c == '<') {
                    if (pointer > 0) {
                        pointer--;
                    }
                } else if (c == '>') {
                    if (pointer < list.size()) {
                        pointer++;
                    }
                } else if (c == '-') {
                    if (pointer > 0) {
                        pointer--;
                        list.remove(pointer);
                    }
                } else {
                    list.add(pointer, c);
                    pointer++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : list) {
                sb.append(c);
            }
            sb.append('\n');
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
