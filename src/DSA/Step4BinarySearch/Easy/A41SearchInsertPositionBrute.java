package DSA.Step4BinarySearch.Easy;

public class A41SearchInsertPositionBrute {
	static int Search(int[] arr,int x) {
		int ans=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=x) {
				return i;
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {1,2,4,7};
		int x=6;
		
		int InsertPosition = Search(arr,x);
		
		System.out.print("Insert Position is "+InsertPosition);
	}

}
