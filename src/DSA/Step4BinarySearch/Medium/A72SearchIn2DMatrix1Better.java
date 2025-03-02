package DSA.Step4BinarySearch.Medium;

public class A72SearchIn2DMatrix1Better {
	static int BS(int[] arr,int c,int target) {
		int s=0,e=c-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			else if(arr[mid]>target){
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[][] arr = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		int r = arr.length;
		int c = arr[0].length;
		int target = 14;
		
		int ind=-1;
		for(int i=0;i<r;i++) {
			if(ind!=BS(arr[i],c,target)) {
				System.out.print("rows = "+i+" & column = "+BS(arr[i],c,target));
				break;
			}
		}
	}

}
