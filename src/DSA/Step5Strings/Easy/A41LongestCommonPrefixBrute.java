package DSA.Step5Strings.Easy;

public class A41LongestCommonPrefixBrute {
	static String Common(String s1,String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int p = 0,k=0;
		String ans = "";
		
		while(k<n1 && p<n2) {
			if(s1.charAt(k) == s2.charAt(p)) {
				ans+=s1.charAt(k);
			}else break;
			
			k++;
			p++;
		}
		
		return ans;
	}
	static String findLongest(String[] s) {
		int n = s.length;
		String ans = s[0];
		
		for(int i=1;i<n;i++) {
			 ans = Common(ans,s[i]);
		}
		
		return ans;
	}
	public static void main(String args[]) {
		String [] s = {"flower","floor","float","flag"};
		
		String ans = findLongest(s);
		System.out.print(ans);
	}
}
