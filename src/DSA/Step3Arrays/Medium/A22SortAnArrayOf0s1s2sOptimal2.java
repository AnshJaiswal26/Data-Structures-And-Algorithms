package DSA.Step3Arrays.Medium;
public class A22SortAnArrayOf0s1s2sOptimal2 {
	public static void main(String args[]) {
		
		int [] arr = {1,2,1,0,0,1,0,2,0,2};
		
		int low,mid,high;
		low = 0;
		mid = 0;
		high = arr.length-1;
	
		while(mid<=high) {
			if(arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				
				low++;
				mid++;
			}
			
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				int temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				
				high--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
