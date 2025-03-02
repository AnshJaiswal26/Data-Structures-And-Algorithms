package DSA.Step7StackandQueues;
import java.util.ArrayList;
import java.util.List;

class StockSpanner{
	List<Integer> list;
	
	StockSpanner(){
		list = new ArrayList<>();
	}
	
	int next(int x) {
		
		list.add(x);
		int cnt=0;
		
		for(int i = list.size()-1;i>=0;i--) {	
			if(x>=list.get(i)) cnt++;
			else break;
		}
			
		return cnt;
	}
}

public class StockSpanProblemBrute {
	public static void main(String args[]) {
		StockSpanner Ssp  = new StockSpanner();
		Ssp.next(7);
		Ssp.next(2);
		Ssp.next(1);
		Ssp.next(3);
		Ssp.next(3);
		Ssp.next(1);
		System.out.print(Ssp.next(8));
		
	}
}
