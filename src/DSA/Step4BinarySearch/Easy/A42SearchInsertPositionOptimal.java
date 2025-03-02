package DSA.Step4BinarySearch.Easy;

public class A42SearchInsertPositionOptimal {
	static int SearchPositionBinarySearch(int[] arr,int x) {
		int s=0;
		int e=arr.length-1;
		int ans = arr.length;
		while(s<=e) {
			int mid = s+(e-s)/2;
			
			if(arr[mid]>=x) {
				ans=mid;
				e=mid-1;
			}
			else{
				s=mid+1;
			}	
		}
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {1,2,4,7};
		int x=2;
		
		int InsertPosition=SearchPositionBinarySearch(arr,x);
		System.out.print("Insert Position is "+InsertPosition);
	}

}
