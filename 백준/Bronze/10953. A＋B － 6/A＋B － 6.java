import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String[] s = scanner.next().split(",");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            System.out.println(A + B);
        }
    }
}