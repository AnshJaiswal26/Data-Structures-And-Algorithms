package DSA.Step4BinarySearch.Easy;

public class A81SingleElementInSortedArrBrute {
	public static void main(String args[]) {
		int[] arr = {1,1,2,2,3,3,4,4,5,6,6};
		int ans=-1;
		
		if(arr.length==1) {
			ans=arr[0];
		}
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				if(arr[i]!=arr[i+1]) {
					ans=arr[i];
				}
			}
			else if(i==arr.length-1) {
				if(arr[i]!=arr[i-1]) {
					ans=arr[i];
				}
			}
			else {
				if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) {
					ans = arr[i];
				}
			}
		}
		
		System.out.print(ans);
  	}

}
