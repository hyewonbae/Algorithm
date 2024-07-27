import java.util.Scanner;
public class Main
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Scanner 객체 sc 만들기 
        int A = sc.nextInt();  // 사용자로부터 입력받은 정수를 A에 저장
        int B = sc.nextInt();  // 사용자로부터 입력받은 정수를 B에 저장
        int sum = A*B;   // A와 B의 곱한 값의 합을 sum에 저장
        System.out.println(sum);
        sc.close(); // 종료
    }
}