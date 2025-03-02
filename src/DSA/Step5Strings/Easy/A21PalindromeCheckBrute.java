package DSA.Step5Strings.Easy;

public class A21PalindromeCheckBrute {
	static boolean check(String s) {
		int n = s.length();
		String rev = "";
		
		for(int i=n-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=rev.charAt(i)) return false;
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		String s = "noon";
		boolean ans = check(s);
		System.out.println(ans);
	}
}
