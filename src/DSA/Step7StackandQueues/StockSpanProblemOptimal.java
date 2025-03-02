package DSA.Step7StackandQueues;
import java.util.Stack;

class pair1{
	int a;
	int b;
	
	pair1(int a,int b){
		this.a = a;
		this.b = b;
	}
}

class StockSpanner1{
	Stack<pair1> st = new Stack<>();
	int ind=-1;
	
	StockSpanner1(){
		ind=-1;
		st.clear();
	}
	
	int next(int x) {
		ind += 1;
		int days = 1;
		
			while(!st.isEmpty() && x>=st.peek().a) {
				st.pop();
			}
			if(st.isEmpty()) days = ind - (-1);
			else days = ind - st.pop().b;
			
			st.push(new pair1(x,ind));
		
		return days;
	}
	
}
public class StockSpanProblemOptimal {
	public static void main(String args[]) {
		StockSpanner1 Ssp = new StockSpanner1();
		Ssp.next(7);
		Ssp.next(2);
		Ssp.next(1);
		Ssp.next(3);
		Ssp.next(3);
		Ssp.next(1);
		System.out.print(Ssp.next(8));
	}
}
