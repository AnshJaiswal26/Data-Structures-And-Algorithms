package DSA.Step4BinarySearch.Hard;

public class B13MedianOfTwoSortedArrOptimal {
	static int Median(int[] arr1,int[] arr2) {
		int s1 = arr1.length;
		int s2 = arr2.length;
		
		if(s1>s2) return Median(arr2,arr1);
		int s =0,e=s1;
		int left = (s1+s2+1)/2;
		while(s<=e) {
			int mid1 = (s+e)/2;
			int mid2 = left-mid1;
			int l1 = Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
			int r1 = Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
			
			if(mid1<s1) r1 = arr1[mid1];
			if(mid2<s2) r2 = arr2[mid2];
			if(mid1-1>=0) l1 = arr1[mid1-1];
			if(mid2-1>=0) l2 = arr2[mid2-1];
			
			int ts = s1+s2;
			if(l1<=r2 && l2<=r1) {
				if(ts%2==0) {
					return (Math.max(l1,l2)+Math.min(r1,r2))/2;
				}
				return Math.max(l1,l2);
			}
			else if(l1>r2) e=mid1-1;
			else s=mid1+1;		
		}
		return 0;
	}
	public static void main(String args[]) {
		int[] arr1 = {1, 3, 4, 7, 10, 12};
		int[] arr2 = {2, 3, 6, 15};
		
		int ans = Median(arr1,arr2);
		System.out.print(ans);
	}

}
