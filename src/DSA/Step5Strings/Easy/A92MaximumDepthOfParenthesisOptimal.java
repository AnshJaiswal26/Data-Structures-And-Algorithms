package DSA.Step5Strings.Easy;

public class A92MaximumDepthOfParenthesisOptimal {
	static int CheckDepth(String s) {
		if(s.isEmpty()) return 0;
		
		int cnt = 0,max = Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				cnt+=1;
			}
			else if(s.charAt(i)==')'){
				max = Math.max(cnt,max);
				cnt--;
			}
		}
		
		if(cnt!=0) return -1;
		
		return max;
	}
	public static void main(String args[]) {
		String s = "(1)+((2))+(((3)))";
		int ans = CheckDepth(s);
		System.out.print(ans);
	}
}
