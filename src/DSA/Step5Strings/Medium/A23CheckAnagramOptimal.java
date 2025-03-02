package DSA.Step5Strings.Medium;

public class A23CheckAnagramOptimal {
	static boolean Check(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		int n = s1.length();
		
		int[] alpha = new int[26];
		
		for(int i=0;i<n;i++) {
			alpha[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<n;i++) {
			alpha[s2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<26;i++) {
			if(alpha[i]!=0) return false;
		}
		
		return true;
	}
	public static void main(String args[]) {
		String s1 = "title";
		String s2 = "litet";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
