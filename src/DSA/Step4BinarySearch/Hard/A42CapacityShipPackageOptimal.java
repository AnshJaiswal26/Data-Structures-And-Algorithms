package DSA.Step4BinarySearch.Hard;

public class A42CapacityShipPackageOptimal {
		static int max(int[] arr,int s) {
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<s;i++) {
				if(arr[i]>max) max=arr[i];
			}
			return max;
		}
		static int maxsum(int[] arr,int s) {
			int sum =0;
			
			for(int i=0;i<s;i++) {
				sum+=arr[i];
			}
			return sum;
		}
		static int daycount(int[] arr,int s,int cap) {
			int load=0,cnt=1;
			for(int i=0;i<s;i++) {

				if(load+arr[i]>cap) {
					load=arr[i];
					cnt++;
				}
				else {
					load+=arr[i];
				}	
			}
			
			return cnt;
		}
		static int Capacity(int[] arr,int s,int days) {
			int st=max(arr,s);
			int e=maxsum(arr,s);
			
			while(st<=e){
				int mid = (st+e)/2;
				if(days>=daycount(arr,s,mid)) {
					e=mid-1;
				}
				else {
					st=mid+1;
				}
			}
			return st;
		}
		public static void main(String args[]) {
			int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
			int s = arr.length;
			int days = 5;
			
			int ans = Capacity(arr,s,days);
			
			System.out.print("Ship Capacity = "+ans);
	}

}


