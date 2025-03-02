package DSA.Step4BinarySearch.Hard;

public class A31MiniDayToMakeMBouquetsBrute {
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
	static int MinimumDays(int[] arr,int s,int m,int k,int max,int min) {
		if(s<(m*k)) return -1;
		for(int i=min;i<=max;i++) {
			if(Possible(arr,s,i,m,k)==true) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		
		int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
		int m=2,k=3;
		int s=arr.length;
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		
	    max=max(arr,max,s);
		min=min(arr,min,s);
		
		System.out.print(MinimumDays(arr,s,m,k,max,min));
		
	}

}
