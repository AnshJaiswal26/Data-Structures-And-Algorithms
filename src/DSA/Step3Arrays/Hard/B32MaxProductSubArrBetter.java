package DSA.Step3Arrays.Hard;

public class B32MaxProductSubArrBetter {
	public static void main(String args[]) {
		int [] arr = {1,2,-3,0,-4,-5};
		int s = arr.length;
		int prod,result=Integer.MIN_VALUE;
		
		for(int i=0;i<s;i++) {
			prod=1;
			for(int j=i;j<s;j++) {
				prod = prod*arr[j];
				result = Math.max(prod,result);
			}
		}
		
		System.out.print(result);
	}

}
