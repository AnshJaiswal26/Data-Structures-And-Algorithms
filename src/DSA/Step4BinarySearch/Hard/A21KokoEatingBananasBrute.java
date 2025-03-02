package DSA.Step4BinarySearch.Hard;

public class A21KokoEatingBananasBrute {
	static double function(int[] arr,int s,double hours) {
		double totalhrs = 0;
		double div = 0;
		for(int i=0;i<s;i++) {
			div=arr[i]/hours;
			totalhrs = totalhrs+ Math.ceil(div);
		}
		return totalhrs;
	}
	
	public static void main(String args[]) {
		int[] arr = {3, 6, 7, 11};
		int s = arr.length;
		double RequiredBananas=0,time = 8;
		
		
		for(double i=1;i<=arr[1];i++) {
			RequiredBananas = function(arr,s,i);
			if(RequiredBananas<=time) {
				System.out.print(i);
				break;
			}
		}
	}

}
