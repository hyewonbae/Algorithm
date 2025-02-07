import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	
    	int n1,n2,sum1=0,sum2=0;
    	
    	n1=scanner.nextInt();
    	n2=scanner.nextInt();
    	
    	for(int i=0;i<n1;i++) {
    		sum1=sum1+scanner.nextInt();
    	}
    	for(int i=0;i<n2;i++) {
    		sum2=sum2+scanner.nextInt();
    	}
    	
    	System.out.println(sum1-sum2);
  }
}