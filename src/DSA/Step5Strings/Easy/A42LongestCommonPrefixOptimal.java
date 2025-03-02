package DSA.Step5Strings.Easy;
import java.util.Arrays;

public class A42LongestCommonPrefixOptimal{
	
	static String findLongest(String[] s) {
		
		int n = s.length;
		Arrays.sort(s);
		
		char first[] = s[0].toCharArray();
		char Last[] = s[n-1].toCharArray();
		
		int i;
		for(i=0;i<n;i++) {
			if(first[i]!=Last[i]) break;
		}
		
		return s[0].substring(0,i);
	}
	public static void main(String args[]) {
		String [] s = {"flower","floor","float","flag"};
		
		String ans = findLongest(s);
		System.out.print(ans);
	}
}
