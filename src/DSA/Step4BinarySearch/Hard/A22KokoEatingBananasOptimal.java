package DSA.Step4BinarySearch.Hard;

public class A22KokoEatingBananasOptimal {
	static int funct(int mid,int[] arr,int l) {
		
		int totalhrs=0;
		
		for(int i=0;i<l;i++) {
			double div = ((double)arr[i]/(double)mid);
			
			totalhrs+=Math.ceil(div);
			
		}
		return totalhrs;
	}
	static int BananasPerHour(int[] arr,int l,int time) {
		int s=1,e=arr[l-1];
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(time==funct(mid,arr,l)) {
				return mid;
			}
			else if(time>funct(mid,arr,l)){
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {3, 6, 7, 11};
		int s = arr.length;
		int time=8;
		
		int ans = BananasPerHour(arr,s,time);
		
		System.out.print(ans);
	}

}
