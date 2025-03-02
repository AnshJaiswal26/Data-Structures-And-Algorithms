package DSA.Step5Strings.Medium;

import java.util.Arrays;

public class A22CheckAnagramBetter {
	static boolean Check(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		char[] S1 = s1.toCharArray();
		char[] S2 = s2.toCharArray();
		Arrays.sort(S1);
		Arrays.sort(S2);
		
		for(int i=0;i<S1.length;i++) {
			if(S1[i]!=S2[i]) return false;
		}
		
 		return true;
	}
	public static void main(String args[]) {
		String s1 = "anagram";
		String s2 = "naagram";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
