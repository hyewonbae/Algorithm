/**
 *
 * 정보과학관  숭실대별관앞  숭실대입구역
 *          A분뒤 버스 도착
 *   N분 걸어서 지하철 역 + B분뒤 지하철 도착
 *
 *   버스 > 걷기 + 지하철
 * Test Case1
 * 10 5 15
 *
 * Bus
 *
 * Test Case2
 * 1 1 1
 *
 * Anything
 *
 * Test Case3
 * 1 100 1
 *
 * Subway
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int walk_time = Integer.parseInt(st.nextToken());
        int bus_time = Integer.parseInt(st.nextToken());
        int sub_time = Integer.parseInt(st.nextToken());

        if(bus_time < sub_time){
            System.out.println("Bus");
        } else if(bus_time > sub_time){
            System.out.println("Subway");
        } else if (bus_time == sub_time) {
            System.out.println("Anything");
        }

        br.close();
    }
}
