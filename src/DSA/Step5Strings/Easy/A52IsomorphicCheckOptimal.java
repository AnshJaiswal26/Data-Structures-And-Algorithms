package DSA.Step5Strings.Easy;
import java.util.Map;
import java.util.HashMap;

public class A52IsomorphicCheckOptimal {
	static boolean Check(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		Map<Character,Character> mpp = new HashMap<>();
		int n1 = s1.length();
		
		for(int i=0;i<n1;i++) {
			if(!mpp.containsKey(s1.charAt(i))) {
				if(!mpp.containsValue(s2.charAt(i))) {
					mpp.put(s1.charAt(i), s2.charAt(i));
				}else return false;
			}
			else {
				if(mpp.get(s1.charAt(i)) != s2.charAt(i)) return false;
			}
		}
		
		return true;
	}
	public static void main(String args[]) {
		String s1 = "paper";
		String s2 = "title";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
