package DSA.Step3Arrays.Hard;

public class B21ReversePairsBrute {
	public static void main(String args[]) {
		int[] arr = {4, 1, 2, 3, 1};
		int l = arr.length;
		int c=0;
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>2*arr[j]) {
					c++;
				}
			}
		}
		System.out.print(c);
	}

}
