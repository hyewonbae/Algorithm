import java.util.*;
public class Main {
    static int facto(int n) {

        if(n==0 || n==1){
            return 1;
        }
        return n*facto(n-1);
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(facto(n));
    }
}
