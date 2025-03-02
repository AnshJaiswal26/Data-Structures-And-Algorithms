package DSA.Step7StackandQueues;
import java.util.Stack;

public class RemoveKDigitsOptimal {
static String Reverse(char[] exp) {
		
		int start = 0;
		int end = exp.length-1;
		char temp;
		
		while(start<end) {
			temp = exp[end];
			exp[end] = exp[start];
			exp[start] = temp;
			start++;
			end--;
		}
		
		return String.valueOf(exp);
	}

	static String SmallestNum(char[] arr,int k) {
		if(k== arr.length) return "0";
		Stack<Character> st = new Stack<>();
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && arr[i]<st.peek() && k>0) {
				st.pop();
				k--;
			}
			st.push(arr[i]);	
		}
		
		while(k>0) {
			st.pop();
			k--;
		}

		if(st.isEmpty()) return "0";
		
		String ans = "";
		while(!st.isEmpty()) {
			ans+=st.pop();
		}
	    
		while(!ans.isEmpty() && ans.charAt(ans.length()-1)=='0') {
			 ans = ans.replace(ans.substring(ans.length()-1),"");
		}
		
		ans = Reverse(ans.toCharArray());
		return ans;
	}
	
	public static void main(String args[]) {
		String arr = "32423";
		int k=2;
		String ans = SmallestNum(arr.toCharArray(),k);
		System.out.print(ans);
	}
}
