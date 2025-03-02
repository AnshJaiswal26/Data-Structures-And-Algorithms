package DSA.Step1LearnTheBasics.step5BasicHashing;
import java.util.Scanner;
import java.util.Arrays;
public class A2repeatchar {
	public static void main(String args[]) {
		Scanner Sc= new Scanner(System.in);
		
		String s;
		s=Sc.nextLine();
		
		int[] hash = new int[26];
		Arrays.fill(hash,0);
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)-'a']=hash[s.charAt(i)-'a']+1;	
		}
		
		
		int e;
		e=Sc.nextInt();
		while(e>=1) {
			char c;
			c=Sc.next().charAt(0);
			
			System.out.print(hash[c-'a']);
			e--;
			
		}
	}

}
