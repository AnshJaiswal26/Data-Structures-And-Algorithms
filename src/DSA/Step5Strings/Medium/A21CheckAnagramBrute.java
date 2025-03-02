package DSA.Step5Strings.Medium;
import java.util.Map;
import java.util.HashMap;

public class A21CheckAnagramBrute {
	static boolean Check(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		Map<Character,Integer> mpp = new HashMap<>();
		
		int n = s1.length();
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			  cnt = 0;
			for(int j=i;j<n;j++) {
				if(s1.charAt(i) == s1.charAt(j)) cnt++;
			}
			if(!mpp.containsKey(s1.charAt(i))) { 
				mpp.put(s1.charAt(i),cnt);
			}
		}
		for(int i=0;i<n;i++) {
			  cnt = 0;
			for(int j=i;j<n;j++) {
				if(s2.charAt(i) == s2.charAt(j)) {
					cnt++;
				}
			}
			if(mpp.containsKey(s2.charAt(i)) && cnt!=mpp.get(s2.charAt(i))) return false;
			mpp.remove(s2.charAt(i));
		}
		if(mpp.size()!=0) return false;
		
 		return true;
	}
	public static void main(String args[]) {
		String s1 = "anagram";
		String s2 = "naagram";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
