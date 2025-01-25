import java.io.*;
import java.util.*;
/**
 * 5 5
 * 5 7
 * 7 5
 * 
 * 7 7
 * */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token;

        int x_axis[] = new int[3];
        int y_axis[] = new int[3];

        for(int i = 0; i < 3; i++) {
            token = new StringTokenizer(br.readLine());
            x_axis[i] = Integer.parseInt(token.nextToken());
            y_axis[i] = Integer.parseInt(token.nextToken());
        }

        br.close();

        bw.write(findAxis(x_axis) + " " + findAxis(y_axis));
        bw.flush();
        bw.close();
    }
    //각각(x와 y)의 좌표값을 찾아주는 메서드
    static int findAxis(int[] array){
        if(array[0] == array[1]){
            return array[2];
        }else{
            return (array[0] == array[2]) ? (array[1]) : (array[0]);
        }
    }
}

