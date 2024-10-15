import java.io.*;
import java.util.*;

/**
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 *
 * 2
 * 5
 * 7
 * 17
 * 7
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }

}
