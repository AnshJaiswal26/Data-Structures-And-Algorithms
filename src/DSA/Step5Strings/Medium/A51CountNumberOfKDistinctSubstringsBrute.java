package DSA.Step5Strings.Medium;
import java.util.Set;
import java.util.HashSet;

public class A51CountNumberOfKDistinctSubstringsBrute {
	static int Count(String s,int k) {
			
		int dist = 0,ans = 0;
		
		for(int i=0;i<s.length();i++) {
			
			dist = 0;
			Set<Character> set = new HashSet<>();
			
			for(int j=i;j<s.length();j++) {
				
				if(!set.contains(s.charAt(j))) {
					set.add(s.charAt(j));
					dist++;
				}
				
				if(dist==k) {
					ans+=1;
				}
				
				if(dist>k) {
					break;
				}
			}
		}
		
		return ans;
	}
	public static void main(String args[]) {
		String s = "aba";
		int k = 2;
		int ans = Count(s,k);
		System.out.print(ans);
	}
}
