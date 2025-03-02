package DSA.Step4BinarySearch.Hard;
import java.util.PriorityQueue;

public class A92MinimizeMaxDisBWGasStationBetter {
	public static class Pair{
		double first;
		int second;
		
		Pair(double first,int second){
			this.first = first;
			this.second = second;
		}
	}
	static double MaxDis(int[] arr,int l,int GS) {
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Double.compare(b.first,a.first));
		int[] howmany = new int[l-1];
		
		for(int i=0;i<l-1;i++) {
			pq.add(new Pair(arr[i+1]-arr[i],i));
		}
		
		for(int GasStations = 1;GasStations<=GS;GasStations++) {
			
			Pair tp = pq.poll();
			int secInd = tp.second;
			
			howmany[secInd]++;
			
			double inidiff = arr[secInd+1]-arr[secInd];
			double secLen = inidiff/(double)(howmany[secInd]+1);
			
			pq.add(new Pair(secLen,secInd));
			
		}
		
		return pq.peek().first;
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5};
		int l = arr.length;
		
		int GS = 5;
		
		double ans = MaxDis(arr,l,GS);
		
		System.out.print(ans);
	}

}
