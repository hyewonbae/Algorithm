/**
 * How are you today?
 * Quite well, thank you, how about yourself?
 * I live at number twenty four.
 * 
 * 7
 * 14
 * 9
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            int count = 0;

            if(str.equals("#"))
                break;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
                    || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                    count++;
                }
            }
            System.out.println(count);

        }

        br.close();
    }
}
