import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for(String year:arr){
            int y = Integer.parseInt(year);
            int k = Integer.parseInt(year.substring(2,4));
            if((y+1)%k == 0){
                System.out.println("Good");
            } else{
                System.out.println("Bye");
            }
        }
    }
}
