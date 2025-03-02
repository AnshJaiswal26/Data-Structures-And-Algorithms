package DSA.Step3Arrays.Hard;

public class A91MissingAndRepeatingBrute {
	public static void main(String args[]) {
		int[] arr = {4,6,2,1,5,5};
		int s =arr.length;
		int repeat=0,missing=0,c=0;
		
		for(int i=1;i<=s;i++) {
			for(int j=0;j<s;j++) {
				if(arr[j]==i) {
					c++;
				}
			}
			if(c>1) {
				repeat=i;
			}
			if(c==0) {
				missing=i;
			}
			c=0;
		}
		System.out.print("Repeating element is "+repeat+" & missing element is "+missing);
	}

}
