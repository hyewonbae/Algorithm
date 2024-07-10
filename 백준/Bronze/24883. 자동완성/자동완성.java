import java.io.*;
import java.util.*;
/*검색창에 N 또는 n이 입력되면 Naver D2가 자동 완성되도록 설정하고 싶다.
 *  알파벳 하나를 입력받아서 그 알파벳이 N 또는 n이면 Naver D2를 출력하고, 
 * 아니라면 Naver Whale을 출력하는 프로그램을 작성
 * */
public class Main{
    public static void main(String[] args) throws Exception{
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       if(ch=='N'|| ch=='n') {
    	   System.out.println("Naver D2");
    	   
       }else {
    	   System.out.println("Naver Whale");
       }
       
       sc.close();
    }
}