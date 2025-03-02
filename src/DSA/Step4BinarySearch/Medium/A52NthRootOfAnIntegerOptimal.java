package DSA.Step4BinarySearch.Medium;
import java.util.*;
public class A52NthRootOfAnIntegerOptimal {
	static int BinarySearch(int n,int m) {
		int s=1,e=m-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			
			if(Root(mid,n,m)==1) {
				return mid;
			}
			else if(Root(mid,n,m)==0) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		
		return -1;
	}
	static int Root(int mid,int n,int m) {
		int x = mid;
		int j = 1;
		
		while(j<n) {
			mid=mid*x;
			if(mid>m) return 2;
			j++;
		}
		if(mid==m) return 1;
		
		return 0;
	}
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int n,m=256;
		n=Sc.nextInt();
		
		int ans = BinarySearch(n,m);
		
		System.out.print(ans);
	}

}
