package DSA.Step4BinarySearch.Medium;

public class A22SearchElementinRotatedArrDuplicateOptimal {
	static int BinarySearch(int[] arr,int x) {
		int ans=-1;
		int s=0,e=arr.length-1;
		
		while(s<=e) {
			int mid=s+(e-s)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[s]==arr[mid] && arr[mid]==arr[e]) {
				s++;e--;
				continue;
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
		int[] arr = {9 ,1,2,3,3,6,7,8};
		int x=2;
		
		int ans = BinarySearch(arr,x);
		System.out.print(ans);
	}

}
