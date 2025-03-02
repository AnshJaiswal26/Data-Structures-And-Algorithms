package DSA.Step3Arrays.Medium;

public class A21SortAnArrayOf0s1s2sBetter2 {
	public static void main(String args[]) {
		int [] arr = {0,1,1,0,2,2,1,0,2};
		
		int c1=0,c2=0,c3=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c1++;
			}
			else if(arr[i]==1){
				c2++;
			}
			else {
				c3++;
			}
		}
		
		for(int i=0;i<c1;i++) {
			arr[i]=0;
		}
		for(int i=c1;i<c1+c2;i++) {
			arr[i]=1;
		}
		for(int i=c1+c2;i<arr.length;i++) {
			arr[i]=2;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
