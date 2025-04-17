import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bombStr = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));

            if(sb.length() >= bombStr.length()){
                boolean isSame = true;
                for(int j = 0; j < bombStr.length(); j++){
                    if(sb.charAt(sb.length() - bombStr.length() + j) != bombStr.charAt(j)){
                        isSame = false;
                        break;
                    }
                }

                if(isSame){
                    sb.delete(sb.length() - bombStr.length(), sb.length());
                }
            }
        }
        System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());

    }
}
