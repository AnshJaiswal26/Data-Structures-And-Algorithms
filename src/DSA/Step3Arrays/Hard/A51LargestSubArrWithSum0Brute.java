package DSA.Step3Arrays.Hard;

public class A51LargestSubArrWithSum0Brute {
	public static void main(String args[]) {
		int[] arr = {9, -3, 3, -1, 6, -5};
		int s = arr.length;
		int sum,result=0;
		
		for(int i=0;i<s;i++) {
			sum=0;
			for(int j=i;j<s;j++) {
				
				sum=sum+arr[j];
				
				if(sum==-1) {
					result=Math.max(j-i+1,result);
				}
				
			}	
		}
		System.out.print(result);
	}

}
