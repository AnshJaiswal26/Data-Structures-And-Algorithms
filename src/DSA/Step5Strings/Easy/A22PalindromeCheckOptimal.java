package DSA.Step5Strings.Easy;

public class A22PalindromeCheckOptimal {
	static boolean check(char[] s) {
		int n = s.length;
		int start = 0,end = n-1;
		
		while(start<end) {
			if(s[start]!=s[end]) return false;
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String args[]) {
		String s = "nitin";
		boolean ans = check(s.toCharArray());
		System.out.println(ans);
	}
}
