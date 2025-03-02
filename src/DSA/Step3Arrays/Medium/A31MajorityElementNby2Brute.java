package DSA.Step3Arrays.Medium;

public class A31MajorityElementNby2Brute {
	public static void main(String args[]) {
	
		int[] arr = {1,1,3,1,2,1,2};
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				System.out.print(arr[i]);
				break;
			}
		}
	}

}
