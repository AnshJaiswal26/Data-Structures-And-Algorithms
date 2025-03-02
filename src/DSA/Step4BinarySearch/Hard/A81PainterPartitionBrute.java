package DSA.Step4BinarySearch.Hard;

public class A81PainterPartitionBrute {
	
	static int max(int[] arr,int l) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<l;i++) {
			if(arr[i]>max) max=arr[i];
		}
		return max;
	}
	
	static int Sum(int[] arr,int l) {
		int sum = 0;
		
		for(int i=0;i<l;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	static int Partition(int[] arr,int l,int i) {
		int pcnt=1,tsum=0;
		for(int j=0;j<l;j++) {
			if(tsum+arr[j]<=i) {
				tsum+=arr[j];
			}
			else {
				tsum=arr[j];
				pcnt++;
			}
		}
		return pcnt;
	}
	
	static int MinTime(int[] arr,int l,int k) {
		for(int i=max(arr,l);i<Sum(arr,l);i++){	
			if(Partition(arr,l,i)==k) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {10, 20, 30, 40};
		int l = arr.length;
		int k=2;
		
		int ans = MinTime(arr,l,k);
		
		System.out.print(ans);
	}

}
