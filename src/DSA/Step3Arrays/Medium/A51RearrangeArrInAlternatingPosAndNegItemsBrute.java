package DSA.Step3Arrays.Medium;

public class A51RearrangeArrInAlternatingPosAndNegItemsBrute {
	public static void main(String args[]) {
		int[] arr = {3,1,-2,-5,2,-3};
		int s=arr.length,p=0,n=0;
		int[] pos = new int[s/2];
		int[] neg = new int[s/2];
		
		for(int i=0;i<s;i++) {
			if(arr[i]>=0) {
				pos[p]=arr[i];
				p++;
			}
			else {
				neg[n]=arr[i];
				n++;
			}
		}
		
		for(int i=0;i<s/2;i++) {
			arr[i*2]=pos[i];
			arr[i*2+1]=neg[i];
		}
		
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
