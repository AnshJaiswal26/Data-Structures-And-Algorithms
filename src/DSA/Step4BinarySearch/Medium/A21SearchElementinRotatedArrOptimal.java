package DSA.Step4BinarySearch.Medium;

public class A21SearchElementinRotatedArrOptimal {
	static int BinarySearch(int[] arr,int x) {
		int ans=-1;
		int s=0,e=arr.length-1;
		
		while(s<=e) {
			int mid=s+(e-s)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[s]<=arr[mid]) {
				if(arr[s]<=x && x<=arr[mid]) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
			else {
				if(arr[mid]<=x && x<=arr[e]) {
					s=mid+1;
				}
				else {
					e=mid-1;
				}
			}
			
		}
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {7,8,9,1,2,3,4,5,6};
		int x=6;
		
		int ans = BinarySearch(arr,x);
		System.out.print(ans);
	}

}
