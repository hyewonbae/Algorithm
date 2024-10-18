/**
 * 3
 * 1 2 3
 *
 * 0
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        boolean[] seats = new boolean[101]; // maximum 100 seats
        int count = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < n ; i++){
           int seat = Integer.parseInt(st.nextToken());
           if(seats[seat]){
               count++;
           } else {
               seats[seat] = true;
           }
        }

        System.out.println(count);
        br.close();
    }
}
