package DSA.Step5Strings.Medium;

public class A52CountNumberOfKDistinctSubstringsOptimal {
	
	static int Count(String s,int k) {
		return KDist(s,k)-KDist(s,k-1);
	}
	
	static int KDist(String s,int k) {
		int ans = 0;
		
		int [] alpha = new int[26];
		int l=0,dist=0;
		
		for(int i=0;i<s.length();i++) {
			
			alpha[s.charAt(i)-'a']++;
			if(alpha[s.charAt(i)-'a']==1) dist++;
			
			if(dist>k) {
				alpha[s.charAt(l)-'a']--;
				if(alpha[s.charAt(l)-'a']==0) dist--;
				l++;
			}
			
			ans+=(i-l+1);
		}
 		
		return ans;
	}
	public static void main(String args[]) {
		String s = "abcd";
		int k = 3;
		int ans = Count(s,k);
		System.out.print(ans);
	}
}
