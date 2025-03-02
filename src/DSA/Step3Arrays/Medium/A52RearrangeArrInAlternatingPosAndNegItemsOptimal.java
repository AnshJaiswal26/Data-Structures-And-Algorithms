package DSA.Step3Arrays.Medium;

public class A52RearrangeArrInAlternatingPosAndNegItemsOptimal {
	public static void main(String args[]) {
		int[] arr = {3,-1,-4,-2,1,4}; 
		int s=arr.length;
		int arr1[] = new int[s];
		int p=0,n=1;
		
		for(int i=0;i<s;i++) {
			if(arr[i]>=0) {
				arr1[p]=arr[i];
				p=p+2;
			}
			else {
				arr1[n]=arr[i];
				n=n+2;
			}
		}
		for(int i=0;i<s;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
