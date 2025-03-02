package DSA.Step3Arrays.Hard;

public class A93MissingAndRepeatingOptimal {
	public static void main(String args[]) {
		int[] arr = {3,6,2,1,1,5};
		int s = arr.length;
		int sum=0,sumn=0,sum2=0,sum2n=0;
		
		for(int i=0;i<s;i++) {
			sum = sum + arr[i];
			sumn=sumn+(i+1);
			
			sum2 = sum2 + (arr[i]*arr[i]);
			sum2n = sum2n + ((i+1)*(i+1));
		}
		
		int xmy;
		xmy=sum-sumn; //eq1
		
		int xpy;
		xpy=sum2-sum2n;
		
		xpy=xpy/xmy; //eq2
		
		int x,y;
		x=(xmy+xpy)/2;
		
		y=x-xmy;
		
		System.out.print("repeating element is "+x+" & missing element is "+y);
	}
}
