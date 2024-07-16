import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int number = a * b * c;
		int[] counts = new int[10];
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}

	}

}