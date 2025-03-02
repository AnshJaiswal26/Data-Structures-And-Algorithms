package DSA.Step5Strings.Easy;
import java.util.Map;
import java.util.HashMap;

public class A51IsomorphicCheckBrute {
	static boolean Check(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		Map<Character,Character> mpp = new HashMap<>();
		Map<Character,Character> mpp1 = new HashMap<>();
		
		int n1 = s1.length();
		
		for(int i=0;i<n1;i++) {
			mpp.put(s1.charAt(i), s2.charAt(i));
			mpp1.put(s2.charAt(i), s1.charAt(i));
		}
		
		for(int i=0;i<n1;i++) {
			if(s2.charAt(i)!=mpp.get(s1.charAt(i)) || s1.charAt(i)!=mpp1.get(s2.charAt(i))) return false;
		}
		
		return true;
	}
	public static void main(String args[]) {
		String s1 = "badc";
		String s2 = "kikp";
		
		boolean ans = Check(s1,s2);
		System.out.print(ans);
	}
}
