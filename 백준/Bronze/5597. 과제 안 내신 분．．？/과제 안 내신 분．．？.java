import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []student = new int[31];

        for(int i = 0; i<28; i++){
            int num =  Integer.parseInt(br.readLine());
            student[num-1] = 1;
        }
        for(int i = 0; i<30; i++){
            if(student[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
