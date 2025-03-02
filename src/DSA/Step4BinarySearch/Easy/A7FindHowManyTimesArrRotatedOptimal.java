package DSA.Step4BinarySearch.Easy;

public class A7FindHowManyTimesArrRotatedOptimal {
		static int BinarySearch(int[] arr) {
			int ans=Integer.MAX_VALUE;
			int index=-1;
			int s=0,e=arr.length-1;
			
			while(s<=e) {
				int mid=s+(e-s)/2;
				
				if(arr[s]==arr[mid] && arr[mid]==arr[e]) {
					if(arr[s]<ans) {
						ans=arr[s];
						index=s;				
					}
					s++; e--;
					continue;
				}
				
				if(arr[s]<=arr[e]) {
					if(arr[s]<ans) {
						index=s;
						ans=arr[s];
					}
					break;
				}	
				
				else if(arr[mid]>=arr[s]) {
					if(arr[s]<ans) {
						index=s;
						ans=arr[s];
					}
					s=mid+1;
				}
				
				else {
					if(arr[mid]<ans) {
						index=mid;
						ans=arr[mid];
					}					
					e=mid-1;	
				}
			}
			return index;
		}
		public static void main(String args[]) {
			int[] arr = {6,7,8,9,3,4,5};
			
			int index = BinarySearch(arr);
			
			System.out.print("Array has been rotated "+index+" times");
	}

}


