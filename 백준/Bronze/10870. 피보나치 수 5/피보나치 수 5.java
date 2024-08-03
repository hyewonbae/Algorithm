import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int i){
        if(i<2)return i;

        return fibonacci(i-1)+fibonacci(i-2);
    }
}
