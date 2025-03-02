package DSA.Step4BinarySearch.Easy;
import java.util.*;
public class B22RowWithMaxNumOf1sIn2DArrOptimal {
	static int lowerboundBS(ArrayList<Integer> matrix,int c,int x) {
		int s=0,e=c-1;
		int ans = c;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(matrix.get(mid)>=x) {
				ans = mid;
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return ans;
	}
	static int CntMax1s(ArrayList<ArrayList<Integer>> matrix,int c,int r) {
		int cntmax = 0,ind = -1;
		for(int i=0;i<r;i++) {
			
			int cnt1srow = c-lowerboundBS(matrix.get(i),c,1);
			
			if(cnt1srow>cntmax) {
				cntmax=cnt1srow;
				ind=i+1;
			}
	    }
		return ind;
}
	public static void main(String args[]) {
		int r=5,c=5;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(0,0,1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
		matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
		matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1,1)));
		
		int ans = CntMax1s(matrix,c,r);
		
		System.out.print(ans);
	}

}
