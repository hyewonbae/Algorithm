/**
 * baekjoon
 *
 * 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int [] alpha = new int[26];
        for(int i=0;i<str.length();i++){
            int temp = str.charAt(i)-97;
            alpha[temp]++;
        }

        for(int i=0;i<26;i++){
            System.out.print(alpha[i]+" ");
        }
    }
}
