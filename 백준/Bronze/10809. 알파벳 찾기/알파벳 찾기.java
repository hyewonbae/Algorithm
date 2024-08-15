import java.io.*;
import java.util.*;
/**
 *
 * baekjoon
 *
 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 * */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i]+" ");
        }
    }
}
