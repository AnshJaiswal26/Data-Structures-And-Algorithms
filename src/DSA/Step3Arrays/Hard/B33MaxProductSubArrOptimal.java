package DSA.Step3Arrays.Hard;

public class B33MaxProductSubArrOptimal {
	public static void main(String args[]) {
		int[] arr = {1,2,-3,0,-4,-5};
		int s= arr.length;
		int prefix = 1 ;
		int sufix = 1;
		int result=Integer.MIN_VALUE;
		
		for(int i=0;i<s;i++) {
			prefix = prefix*arr[i];
			sufix = sufix*arr[s-i-1];
			
			if(prefix==0) prefix=1;
			if(sufix==0) sufix=1;
			
			result = Math.max(result,Math.max(prefix, sufix)); 
		}
		
		System.out.print(result);
	}

}

