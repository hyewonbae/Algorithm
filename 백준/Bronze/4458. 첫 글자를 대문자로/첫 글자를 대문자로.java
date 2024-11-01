/**
 * 5
 * powdered Toast Man
 * skeletor
 * Electra Woman and Dyna Girl
 * she-Ra Princess of Power
 * darth Vader
 *
 * Powdered Toast Man
 * Skeletor
 * Electra Woman and Dyna Girl
 * She-Ra Princess of Power
 * Darth Vader
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String str = br.readLine();
            System.out.println((str.charAt(0)+"").toUpperCase() + str.substring(1,str.length()));
        }
        br.close();
    }
}
