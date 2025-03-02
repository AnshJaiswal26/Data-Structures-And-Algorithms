package DSA.Step4BinarySearch.Medium;

public class A41FindSqRootOfaNumBrute {
	public static void main(String args[]) {
	int n =50;
	int ans=0;
	for(int i=0;i<n;i++){
		if(i*i<=n) {
			ans = i;
		}
		else {
			break;
		}
	}
	
	System.out.print(ans);
	}
}
