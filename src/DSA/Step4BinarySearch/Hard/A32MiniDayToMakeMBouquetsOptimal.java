package DSA.Step4BinarySearch.Hard;

public class A32MiniDayToMakeMBouquetsOptimal {
		static int max(int[] arr,int max,int s) {
			for(int i=0;i<s;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
		
		static int min(int[] arr,int min,int s) {
			for(int i=0;i<s;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			return min;
		}

		static boolean Possible(int[] arr,int s,int day,int m,int k) {
			int cnt=0,noofbuq=0;
			for(int i=0;i<s;i++) {
				if(arr[i]<=day) {
					cnt++;
				}
				else {
					noofbuq=noofbuq+(cnt/k);
					cnt=0;
				}
			}
			noofbuq=noofbuq+(cnt/k);
			
			if(noofbuq>=m) {
				return true;
			}	
		    
			return false;
			
		}
		static int BSMinimumDays(int[] arr,int s,int m,int k,int max,int min) {
			if(s<(m*k)) return -1;
			
			int st=min,e=max,ans=e;
			
			while(st<=e) {
				int mid = (st+e)/2;
				if(Possible(arr,s,mid,m,k)==true) {
					ans=mid;
					e=mid-1;
				}
				else {
					st=mid+1;
				}
			}
			return ans;
		}
		public static void main(String args[]) {
			
			int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
			int m=2,k=3;
			int s=arr.length;
			int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
			
		    max=max(arr,max,s);
			min=min(arr,min,s);
			
			System.out.print(BSMinimumDays(arr,s,m,k,max,min));
			
	}

}


