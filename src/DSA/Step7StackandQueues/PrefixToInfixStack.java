package DSA.Step7StackandQueues;
import java.util.Stack;

public class PrefixToInfixStack {
	static String Convert(String exp) {
		Stack<String> st = new Stack<>();
		String ans = "";
		
		for(int i = exp.length()-1;i>=0;i--) {
			if(Character.isLetterOrDigit(exp.charAt(i))) {
				st.push(String.valueOf(exp.charAt(i)));
			}
			else {
				if(!st.isEmpty() && st.size()>=2) {
					String t1 = st.pop();
					String t2 = st.pop();
					ans = t1 + String.valueOf(exp.charAt(i)) + t2;
					st.push("("+ans+")");
				}
			}
		}
		ans = st.pop();
		return ans;
	}
	public static void main(String args[]) {
		String exp = "*+PQ-MN";
		String ans = Convert(exp);
		System.out.println("Prefix to Infix");
		System.out.println("Prefix - "+exp);
		System.out.print("infix - "+ans);
	}
}
