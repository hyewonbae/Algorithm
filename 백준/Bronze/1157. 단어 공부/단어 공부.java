import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		String word=sc.next().toUpperCase();
		int[] frequency=new int[26];
		
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			frequency[ch-'A']++;
		}
		
		int max=0;
		char result='?';
		
		for(int i=0;i<26;i++) {
			if(frequency[i]>max) {
				max=frequency[i];
				result=(char)(i+'A');
			} else if(frequency[i]==max) {
				result='?';
			}
		}
		System.out.println(result);
		sc.close();
	}
}