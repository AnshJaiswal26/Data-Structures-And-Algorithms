package DSA.Step4BinarySearch.Easy;

public class A12FindXinSortedArrReccursive {
	static int binarysearch(int[] arr,int s,int e,int target){
		if(s>e) {
			return -1;
		}
		
		int mid = s+(e-s)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]<target) {
			s=mid+1;
		}
		else {
			e=mid-1;
		}
		return binarysearch(arr,s,e,target);	
	}
	public static void main(String args[]) {
		int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
		int l = arr.length;
		int s=0,e=l-1;
		int target = 12;
		
		int ans =binarysearch(arr,s,e,target);
		
		System.out.print(ans);
	}

}
