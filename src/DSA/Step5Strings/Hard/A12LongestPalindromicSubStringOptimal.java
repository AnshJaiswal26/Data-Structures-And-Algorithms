package DSA.Step5Strings.Hard;

public class A12LongestPalindromicSubStringOptimal {
	static String FindLongest(char[] s) {
		int n = s.length;
		String ans = "";
		
		int l,r;
		for(int i=1;i<n-1;i++) {
			l=i;
			r=l+1;
			int Not_eq = 2;
			
			while(Not_eq>0 && l>=0) {
				if(s[l]!=s[r]) {
					Not_eq--;
					l--;
				}
				else {
					l--;
					r++;
					if(r-(l+1)>ans.length()) ans = String.valueOf(s).substring(l+1,r);
					if(l<0 || r>=n || s[l]!=s[r]) break;
				}
			}
		}
		
		return ans;
	}
	public static void main(String args[]) {
		String s = "ABRBADAADAB";
		String ans = FindLongest(s.toCharArray());
		System.out.print(ans);
	}
}
