package DSA.Step4BinarySearch.Medium;

public class A63KthElementOfTwoSortedArrOptimal {
	static int Kthele(int[] arr1,int[] arr2,int k) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		if(n1>n2) return Kthele(arr2,arr1,k);
		
		int s=Math.max(0, k-n2);
		int e=Math.min(k,n1);
		int left=k;
		
		int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
		int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
		
		while(s<=e) {
			int mid1=(s+e)/2;
			int mid2=left-mid1;
			
			if(mid1<n1) r1=arr1[mid1];
			if(mid2<n2) r2=arr2[mid2];
			if(mid1>0) l1=arr1[mid1-1];
			if(mid2>0) l2=arr2[mid2-1];
			
			if(l1<=r2 && l2<=r1) {
				return Math.max(l1, l2);
			}
			else if(l1>r2) {
				e=mid1-1;
			}
			else {
				s=mid1+1;
			}
		}
		return 0;
		
	}
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 4, 7, 10, 12};
		int[] arr2 = {2, 3, 6, 15};
		int k = 5;
		
		int ans = Kthele(arr1,arr2,k);
		System.out.print(ans);
	}

}
