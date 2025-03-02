package DSA.Step4BinarySearch.Hard;

public class A62BookAllocationOptimal {
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
		int s=max(arr,l),e=Sumofarr(arr,l);
		
		if(students==1) return e;
		
		while(s<=e){
			int mid = s+(e-s)/2;
			
			if(BookAllocation(arr,l,mid)<=students) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return s;
	}
	
	public static void main(String args[]) {
		int[] ArrBooks = {25, 46, 28, 49, 24};
		int l = ArrBooks.length;
		int students = 4;
		
		int  ans = PossibleMinPages(ArrBooks,l,students);
		
		System.out.print(ans);
 	}

}
