package DSA.Step7StackandQueues;
import java.util.Stack;

public class PostfixToPrefix {
	static String Convert(String exp) {
		Stack<String> st = new Stack<>();
		String ans = "";
		
		for(int i=0;i<exp.length();i++) {
			if(Character.isLetterOrDigit(exp.charAt(i))) {
				st.push(String.valueOf(exp.charAt(i)));
			}
			else {
				String t1 = st.pop();
				String t2 = st.pop();
				
				ans = String.valueOf(exp.charAt(i))+t2+t1;
				st.push(ans);
			}
		}
		return st.pop();
	}
	public static void main(String args[]) {
		String exp = "AB-DE+F*/";
		String ans = Convert(exp);
		System.out.println("Postfix to Prefix");
		System.out.println("Postfix - "+exp);
		System.out.println("Prefix - "+ans);
	}
}
