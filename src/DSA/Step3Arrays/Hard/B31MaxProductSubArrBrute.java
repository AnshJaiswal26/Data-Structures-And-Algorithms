package DSA.Step3Arrays.Hard;

public class B31MaxProductSubArrBrute {
	public static void main(String args[]) {
		int [] arr = {1,2,-3,0,-4,-5};
		int s = arr.length;
		int prod,result=Integer.MIN_VALUE;
		
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				prod=1;
				for(int k=i;k<=j;k++) {
					prod = prod*arr[k];
				}
				result = Math.max(prod,result);
			}
		}
		
		System.out.print(result);
	}

}
