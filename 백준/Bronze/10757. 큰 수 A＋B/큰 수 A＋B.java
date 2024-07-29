import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main{
    static BigInteger n,m;
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        BigInteger sum=n.add(m);
        
        System.out.print(sum);

        br.close();
    }
}