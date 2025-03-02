package DSA.Step5Strings.Easy;

public class A12RemoveOuterMostParenthesisOptimal{
	static String RemoveOuterMostPara(String s) {
		int n = s.length();
		String ans = "";
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			if(cnt!=0 && s.charAt(i)==')') {
				cnt--;
				if(cnt!=0) ans+=s.charAt(i);
			}
			else {
				if(cnt!=0) ans+=s.charAt(i);
				cnt++;
			}
		}
		
		return ans;
	}
	public static void main(String args[]) {
		String s = "((())()((())))(()())";
		
		String ans = RemoveOuterMostPara(s);
		System.out.print(ans);
	}
}
