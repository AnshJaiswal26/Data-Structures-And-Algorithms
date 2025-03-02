package DSA.Step4BinarySearch.Medium;

public class A3MinimumInRotatedSortedArrOptimal {
	static int BinarySearch(int[] arr) {
		int ans=Integer.MAX_VALUE;
		
		int s=0,e=arr.length-1;
		
		while(s<=e) {
			int mid=s+(e-s)/2;
			
			if(arr[s]==arr[mid] && arr[mid]==arr[e]) {
				ans = Math.min(ans,arr[s]);
				s++; e--;
				continue;
			}
			if(arr[s]<=arr[e]) {
				ans = Math.min(ans,arr[s]);
				break;
			}
			
			else if(arr[mid]>=arr[s]) {
				ans = Math.min(ans,arr[s]);
				s=mid+1;
			}
			else {
				ans=Math.min(ans,arr[mid]);
				e=mid-1;	
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {6,7,8,2,3,4,5};
		
		int ans = BinarySearch(arr);
		
		System.out.print(ans);
	}

}
