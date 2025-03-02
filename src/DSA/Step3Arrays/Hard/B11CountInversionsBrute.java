package DSA.Step3Arrays.Hard;

public class B11CountInversionsBrute {
	public static void main(String args[]) {
		int[] arr = {5,3,2,4,1};
		int s = arr.length;
		
		int c = 0;
		
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				if(arr[i]>arr[j]) {
					c++;
				}
			}
		}
		
		System.out.print(c);
	}

}
