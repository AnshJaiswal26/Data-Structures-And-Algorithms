package DSA.Step4BinarySearch.Medium;

public class A42FindSqRootOfaNumOptimal {
	static int PeakElement(int n,int s,int e) {
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			if((mid*mid)==n) {
				return mid;
			}
			else if((mid*mid)>n) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		
		return e;
	}
	public static void main(String args[]) {
		int n=121;
		int s=1,e=n;
		
		int ans = PeakElement(n,s,e);
		System.out.print(ans);
	}

}
