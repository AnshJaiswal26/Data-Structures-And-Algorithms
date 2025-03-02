package DSA.Step4BinarySearch.Easy;

public class A21LowerBoundBrute {
	static int LB(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=x) {
				return i;
			}
		}
		return arr.length;
	}
	public static void main(String args[]) {
		int[] arr = {3, 5, 8, 15, 19};
		int x=9;
		
		int LowerBound=LB(arr,x);
		System.out.print("index "+LowerBound);
	}

}
