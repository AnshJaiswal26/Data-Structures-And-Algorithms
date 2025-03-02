package DSA.Step4BinarySearch.Easy;

public class A61CountOuccurrencesBrute {
		static int Last(int[] arr,int x) {
			
			int ans=-1;
			
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]==x) {
					return i;
				}
			}
			return ans;
		}
		static int First(int[] arr,int x) {
			
			int ans=-1;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==x) {
					return i;
				}
			}
			return ans;
		}
		public static void main(String args[]) {
			int[] arr = {2,4,6,8,8,8,11,13};
			int x=8;
			
			int Last = Last(arr,x);
			int First = First(arr,x);
			
			System.out.print(Last-First+1);
	}

}


