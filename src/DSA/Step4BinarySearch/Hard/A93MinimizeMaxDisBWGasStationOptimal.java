package DSA.Step4BinarySearch.Hard;

public class A93MinimizeMaxDisBWGasStationOptimal {
	static int StationCnt(double dist,int l,int[] arr) {
		int cnt=0;
		for(int i=0;i<l-1;i++) {
			int numinBetween = (int)((arr[i+1]-arr[i])/dist);
			
			if((arr[i+1]-arr[i]) == numinBetween*dist) {
				numinBetween--;
			}
			
			cnt+=numinBetween;
		}
		return cnt;
	}
	static double MaxDis(int[] arr,int l,int GS) {
		double s = 0;
		double e = 0;

		for(int i=0;i<l-1;i++) {
			double diff = (double)(arr[i+1]-arr[i]);
			
			if(diff>e) e = diff;
		}
		
		double limit = 1e-6;
		
		while(e-s>limit) {
			double mid = (s+e)/2.0;
			
			int cnt = StationCnt(mid,l,arr);
			if(cnt>GS) {
				s=mid;
			}
			else {
				e=mid;
			}
		}
		return e;
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5};
		int l = arr.length;
		int GS = 4;
		
		double ans = MaxDis(arr,l,GS);
		
		System.out.print(ans);
	}

}
