package DSA.Step7StackandQueues;
import java.util.Stack;

public class PostfixToInfixStack {
	static String Convert(String exp) {
		Stack<String> st = new Stack<>();
		String ans = "";
		
		for(int i=0;i<exp.length();i++) {
			if(Character.isLetterOrDigit(exp.charAt(i))) {
				st.push(String.valueOf(exp.charAt(i)));
			}
			else {
				if(!st.isEmpty() && st.size()>=2) {
					String t1 = st.pop();
					String t2 = st.pop();
					ans = t2 +String.valueOf(exp.charAt(i))+t1;
					st.push("("+ans+")");
				}
			}
		}
		ans = st.pop();
		return ans;
	}
	public static void main(String args[]) {
		String exp = "ABC*DEF^/G*-H*+";
		String ans = Convert(exp);
		System.out.println("Postfix to Infix");
		System.out.println("Postfix - "+exp);
		System.out.println("Infix - "+ans);
	}
 
}
