package DSA.Step4BinarySearch.Easy;

public class A82SingleElementInSortedArrOptimal {
	static int BinarySearchSingle(int[] arr) {
		int s=1,e=arr.length-2;
		
		if(arr.length==1) {
			return arr[0];
		}
		if(arr[0]!=arr[s]) {
			return arr[0];
		}
		if(arr[arr.length-1]!=arr[e]) {
			return arr[arr.length-1];
		}
		
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			
			if(arr[mid]==arr[mid-1]) {
				if(mid%2!=0 && (mid-1)%2==0) {
					s=mid+1;
				}
				else {
					e=mid-1;
				}
			}
			else if(arr[mid]==arr[mid+1]) {
				if(mid%2!=0 && (mid+1)%2==0) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
			else{
				return arr[mid];
			}
		}
		return -1;
		
	}
	public static void main(String args[]) {
		int[] arr = {1,1,2,2,3,5,5,6,6,7,7};
		
		int ans = BinarySearchSingle(arr);
		System.out.print("Single Element is "+ans);
	}

}
