package DSA.Step3Arrays.Hard;

public class A61NumOfSubArrWithXorKBetter {
	public static void main(String args[]) {
		int[] arr = {4, 2, 2, 6, 4};
		int k = 6;
		int s = arr.length;
		int count=0;
		for(int i=0;i<s;i++) {
			int Xor = 0;
			for(int j=i;j<s;j++) {
				Xor = Xor^arr[j];
				if(Xor == k) {
					count++;
				}
			}
		}
		
		System.out.print(count);
	}

}
