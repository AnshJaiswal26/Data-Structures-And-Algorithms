package DSA.Step4BinarySearch.Hard;

public class A61BookAllocationBrute {
	static int max(int[] arr,int l) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<l;i++) {
			if(arr[i]>max) max=arr[i];
		}
		
		return max;
	}
	
	static int Sumofarr(int[] arr,int l) {
		int sum = 0;
		for(int i=0;i<l;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	static int BookAllocation(int[] arr,int l,int pages) {
		int stucnt=1,stupages = 0;
		
		for(int i=0;i<l;i++) {
			if(stupages+arr[i]<=pages) {
				stupages+=arr[i];
			}
			else {
				stupages=arr[i];
				stucnt++;
			}
		}
		return stucnt;
	}
	
	static int PossibleMinPages(int[] arr,int l,int students) {
		
		for(int pages = max(arr,l);pages<=Sumofarr(arr,l);pages++) {
			
			if(BookAllocation(arr,l,pages)==students) {
				return pages;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int[] ArrBooks = {25, 46, 28, 49, 24};
		int l = ArrBooks.length;
		int students = 4;
		
		int  ans = PossibleMinPages(ArrBooks,l,students);
		
		System.out.print(ans);
 	}

}
