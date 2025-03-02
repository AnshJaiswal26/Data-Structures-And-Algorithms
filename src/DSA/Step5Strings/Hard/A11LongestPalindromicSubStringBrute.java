package DSA.Step5Strings.Hard;

public class A11LongestPalindromicSubStringBrute {
	static String FindLongest(char[] s) {
		int n = s.length;
		String ans = "";
		
		int i;
		for(i=0;i<n;i++) {
			int j;
			for(j=i;j<n;j++) {
				int l=i,r=j;
				while(l<r) {
					if(s[l]==s[r]) { 
						l++;
						r--;
					}
					else break;
				}
				if(l>=r) {
					if((j+1)-i>ans.length()) {
						ans = String.valueOf(s).substring(i,j+1);
					}
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
